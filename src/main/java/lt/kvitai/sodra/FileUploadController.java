package lt.kvitai.sodra;

import generated.Line;
import generated.Zin;
import generated.ZinB;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class FileUploadController {

	@RequestMapping(value = "/upload", method = RequestMethod.GET)
	public String provideUploadInfo(Locale locale, Model model) {
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "upload";
	}
	


	@RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
	public @ResponseBody ModelAndView handleFileUpload(@RequestParam("name") String name, @RequestParam("file") MultipartFile file) {
		ModelAndView modelAndView = new ModelAndView();
		if (!file.isEmpty()) {
			ZinB zinb = null;
			try {
				zinb = parseXml(multipartToFile(file));
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ModelMap model = new ModelMap();
			model.addAttribute("zinb", zinb);
			modelAndView = new ModelAndView("zinb_list", model);
		}
		return modelAndView;
	}

	public static ZinB parseXml(File file) {
		JAXBContext jaxbContext = null;
		Unmarshaller jaxbUnmarshaller = null;
		ZinB zinB = null;
		try {
			jaxbContext = JAXBContext.newInstance(ZinB.class, Zin.class, Line.class);
			jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			zinB = (ZinB) jaxbUnmarshaller.unmarshal(file);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return zinB;

	}

	private File multipartToFile(MultipartFile multipart) throws IllegalStateException, IOException {
		File convFile = new File(multipart.getOriginalFilename());
		multipart.transferTo(convFile);
		return convFile;
	}

}
