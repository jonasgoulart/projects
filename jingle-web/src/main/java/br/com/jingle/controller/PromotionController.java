package br.com.jingle.controller;

import java.util.ArrayList;
import java.util.List;

import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.view.Results;
import br.com.jingle.domain.Promotion;

@Resource
public class PromotionController 
{
	private Result result;
	
	public PromotionController(Result result)
	{
		this.result = result;
	}
	
	@Path("/promotions")
	public void listPromotions(String latitude, String longitude)
	{
		List<Promotion> promotions = new ArrayList<Promotion>();
		
		Promotion promotion1 = new Promotion();
		promotion1.setTitle("Camisaria Colombo");
		promotion1.setDescribe("Camisaria Colombo: Compre 3 camisas polo e pague R$ 19,90 cada.");
		promotion1.setLatitude("-23.5376313");
		promotion1.setLongitude("-46.6792722");
		
		Promotion promotion2 = new Promotion();
		promotion2.setTitle("Livraria Cultura");
		promotion2.setDescribe("Livraria Cultura: Coleção Harry Potter por R$ 59,90.");
		promotion2.setLatitude("-23.5395522");
		promotion2.setLongitude("-46.6759139");
		
		Promotion promotion3 = new Promotion();
		promotion3.setTitle("Supermercados Dia%");
		promotion3.setDescribe("Supermercados Dia%:  Leve 2 caixas de detergente Ypê e pague R$ 10,90.");
		promotion3.setLatitude("-23.5402103");
		promotion3.setLongitude("-46.6795017");
		
		Promotion promotion4 = new Promotion();
		promotion4.setTitle("Pão de Açúcar");
		promotion4.setDescribe("Pão de Açúcar: Compre uma caixa de Ferrero Roche e leve outra com 30% de desconto.");
		promotion4.setLatitude("-23.5390568");
		promotion4.setLongitude("-46.6786113");
		
		promotions.add(promotion1);
		promotions.add(promotion2);
		promotions.add(promotion3);
		promotions.add(promotion4);
		
		result.use(Results.xml()).from(promotions).serialize();
	}
}
