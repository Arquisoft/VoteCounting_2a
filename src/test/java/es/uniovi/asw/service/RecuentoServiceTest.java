package es.uniovi.asw.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import es.uniovi.asw.Application;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = { Application.class,
	RecuentoService.class })
@WebAppConfiguration
@IntegrationTest({ "server.port=0" })
public class RecuentoServiceTest {
    @Autowired
    RecuentoService recuento;

    @Test(expected = IllegalArgumentException.class)
    public void realizarRecuentoNuloTest() {
	recuento.publicarRecuento(null);

    }

}