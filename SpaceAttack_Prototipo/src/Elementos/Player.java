package Elementos;

import java.awt.Image;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

public class Player {
	private int x, y;
	private int dx, dy;
	private Image imagem;
	private int altura, largura;
	
	public Player() {
		this.x = 100;
		this.y = 100;
	}
	public void load() {
		ImageIcon referencia = new ImageIcon("Image\\Nave_Prototipo.png");
		imagem = referencia.getImage();
	}
	
	public void update() {
		x = x + dx;
		y = y + dy;
	}
	
	public void keyPressed(KeyEvent tecla) {
		int codigo = tecla.getKeyCode();
		
		if(codigo == KeyEvent.VK_UP) {
			dy=-3;
		}
		
		if(codigo == KeyEvent.VK_DOWN) {
			dy=3;
		}
		
		if(codigo == KeyEvent.VK_LEFT) {
			dx=-3;
		}
		
		if(codigo == KeyEvent.VK_RIGHT) {
			dx=3;
		}
	}
	public void keyRelease(KeyEvent tecla) {
		int codigo = tecla.getKeyCode();
		
		if(codigo == KeyEvent.VK_UP) {
			dy=0;
		}
		
		if(codigo == KeyEvent.VK_DOWN) {
			dy=0;
		}
		
		if(codigo == KeyEvent.VK_LEFT) {
			dx=0;
		}
		
		if(codigo == KeyEvent.VK_RIGHT) {
			dx=0;
		}
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getDx() {
		return dx;
	}
	public void setDx(int dx) {
		this.dx = dx;
	}
	public int getDy() {
		return dy;
	}
	public void setDy(int dy) {
		this.dy = dy;
	}
	public Image getImagem() {
		return imagem;
	}
	public void setImagem(Image imagem) {
		this.imagem = imagem;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public int getLargura() {
		return largura;
	}
	public void setLargura(int largura) {
		this.largura = largura;
	}
	
	
}


