package projeto.p3.DevFlix.servlet;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

@WebServlet(
		name = "DevFlixServlet",
		urlPatterns = {"/devflix"}
		)
public class DevFlixServlet extends HttpServlet {

	private static final long serialVersionUID = -2106245008434508098L;

	@Autowired
	RestTemplate restTemplate;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nome = req.getParameter("nome");
		
		String url = "https://robohash.org/miguel/200/" + nome + ".png";
		byte [] imagem = this.restTemplate.getForObject(url, byte[].class);
	
		resp.setContentType("image/png");
		
		ByteArrayInputStream bis = new ByteArrayInputStream(imagem);
		BufferedImage img = ImageIO.read(bis);
		
		ImageIO.write(img, "png", resp.getOutputStream());
	}
}
