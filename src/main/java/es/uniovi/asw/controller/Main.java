package es.uniovi.asw.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import es.uniovi.asw.rest.RecuentoRest;
import es.uniovi.asw.rest.VotoRest;

//@RestController
@Controller
public class MainController {

	@Autowired
	private VotoService votoService;

	@Autowired
	private RecuentoService recuentoService;

	private static final Logger LOG = LoggerFactory
			.getLogger(MainController.class);

	@RequestMapping("/")
	public ModelAndView landing() {
		LOG.info("Landing page access");
		return new ModelAndView("landing");
	}

@RequestMapping("/online")
	public ModelAndView verResultadosOnline(Long idEleccion) {
}
@RequestMapping("/recuento")
	public ModelAndView realizarRecuento(Long idEleccion) {
}
@RequestMapping("/estadisticas")
	public ModelAndView verEstadisticas(Long idEleccion) {
}
	
}