package com.example.demo;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// @RestController annotasyonu, Spring Boot'ta RESTful web servislerini oluşturmak için kullanılır.
// Bu annotasyonu kullanarak, sınıfın bir RESTful web servisi olduğunu belirtirsiniz.

@RestController
@RequestMapping(path = "/api")
public class HelloController {
	
	//@GetMapping annotasyonu ise, HTTP GET talebi için bir yönlendirici yöntemi tanımlamanızı sağlar...
	
	//@RequestMapping(path = "/hello", method = RequestMethod.GET) eski yöntem ve okuması biraz zor
	@GetMapping(path = "/hallo")
	public String sayHello() {
		// bu fonksiyon isteklere yanıt verecek bir endpoint
		return "<p>This is normal text - <b>and this is bold text it is hugeeeee!!!!</b>.</p>";
	}
	
	@PostMapping(path = "/save")
	public String save() {
		return "Data Saved!";
	}
	
	@DeleteMapping(path = "/delete")
	public String delete() {
		return "data deleted!";
	}
}

// genel sınıfın açıklaması 
/*
  		RESTful web servisler, web uygulamalarında kullanılan bir API türüdür. 
  		
  	"REST" kısaltması "Representational State Transfer" olarak adlandırılır 
  	
  	ve bir web servisi için standart bir arayüz tanımlar.
	
	Bir RESTful web servisi, HTTP protokolünü kullanarak iletişim kurar. 
	
	Bu web servisi, bir istemciden HTTP isteklerini alır ve isteğe bağlı olarak bir 
	
	yanıt döndürür. HTTP protokolü, GET, POST, PUT, DELETE ve diğer HTTP yöntemlerini 
	
	kullanarak bu istekleri yönetir.

		
		RESTful web servisler, kaynakların benzersiz bir URI'si (Uniform Resource Identifier) ile tanımlanır. 
	
	Her kaynak, özel bir URI'ye sahip olmalıdır. Bu kaynaklara erişmek için kullanılan 
	
	HTTP yöntemi, kaynağın ne yapacağını belirler.

		
		Örneğin, bir RESTful web servisi kullanarak bir kitap mağazası uygulaması geliştiriyorsanız, 
	
	bir kitap listesi kaynağına HTTP GET isteği göndererek kitapların listesini alabilirsiniz. 
	
	Yeni bir kitap eklemek için HTTP POST isteği gönderirsiniz. Mevcut bir kitabı güncellemek için
	
	HTTP PUT isteği gönderirsiniz ve bir kitabı silmek için HTTP DELETE isteği gönderirsiniz.
	
	Bu şekilde, RESTful web servisler, istemcilerin (genellikle bir web tarayıcısı veya mobil uygulama) 
	
	web uygulaması sunucusu ile etkileşim kurmasına olanak tanır. RESTful web servislerin en 
	
	önemli özelliklerinden biri, istemci ve sunucu arasındaki bağımsızlığı sağlamasıdır. 
	
	Bu, farklı platformlarda ve dillerde yazılmış istemcilerin ve sunucuların birbirleriyle 
	
	etkileşim kurmasını kolaylaştırır.
 */

//GET Veri görüntülemek istedigimiz zaman kullanzyoruz. @GetMapping
//POST Veri kaydetmek istedigimiz zaman kullanyoruz. @PostMapping
//PUT Veri güncellemek icin kullanyoruz.* @PutMapping
//PATCH Verinin bir bölümünü güncellemek istedigimiz zaman kullaniyoruz. @PatchMapping
//örn: Parola güncellemek gibi.
//DELETE : Veri silmek istedigimiz zaman kullanzyoruz. @DeleteMapping

//Sözlük

//@RestController
/*
 		@RestController annotation'ı, Spring Framework'te bir sınıfı RESTful web servisler için bir 
 	
 	Controller olarak tanımlamak için kullanılır. Bu annotation, bu sınıfın istemci isteklerini dinleyebilen bir 
 	
 	HTTP uygulaması olduğunu belirtir.
	
		Bu annotation eklenen bir sınıf, içinde tanımlanan HTTP isteklerine yanıt veren bir RESTful web servis haline gelir. 
	
	Sınıfın içinde, HTTP isteklerine yanıt olarak verilecek metotlar (yani endpoint'ler) tanımlanır. Bu metotlar, 
	
	Spring Framework tarafından otomatik olarak HTTP istekleriyle eşleştirilir.

	Örneğin, @RestController annotation'ı ile işaretlenen bir sınıfın içinde @GetMapping annotation'ı ile işaretlenmiş bir metot, 
	
	HTTP GET isteği geldiğinde çalışır ve belirtilen URI için yanıt döndürür. Benzer şekilde, @PostMapping, @PutMapping ve 
	
	@DeleteMapping gibi diğer HTTP metodlarını destekleyen annotation'lar da mevcuttur.

	Bu şekilde, @RestController annotation'ı Spring Framework ile RESTful web servislerin kolayca oluşturulmasını sağlar.
 */

//@GetMapping
/*
 		@GetMapping, Spring Framework'ün bir parçası olan Spring Web modülü tarafından sunulan bir annotation'dır ve HTTP GET 
 	
 	isteklerine yanıt vermek için kullanılır.

	Bir Spring Boot uygulamasında @GetMapping annotation'ı ile işaretlenmiş bir metot, belirtilen URL yoluna yapılan HTTP GET 
	
	isteklerine yanıt verecektir. Bu annotation, Spring Web modülünün özelliklerinden biridir ve RESTful web servislerinde 
	
	kullanımı yaygındır.

		Örneğin, bir Spring Boot uygulamasında @GetMapping annotation'ı ile işaretlenmiş bir metot, /hello URL yoluna 
		
	yapılan HTTP GET isteklerine yanıt verebilir. Bu metot, istekin yanıt olarak ne döndüreceğini belirleyebilir. Örneğin, 
	
	bir metot, bir metin dizesi, bir JSON nesnesi veya bir sayfa gönderebilir.
 */

//@Controller
/*
		@Controller , Spring MVC'de kullanılan bir annotation'dır ve HTTP isteklerini karşılamak için kullanılır. 
	
	Bu sınıfın içinde methodlar oluşturulur ve bu methodlar farklı HTTP metodlarıyla istekleri karşılarlar.
 */

//Endpoint
/*
 		/image-{key} şeklinde olan Endpoint, bir web servisinde istekleri karşılamak için oluşturulan bir URL adresidir. Bu adres, 
 	
 	istemci tarafından kullanılarak web servisine yapılan istekleri yönlendirir. Endpoint'lerin, istemci ile web servisi arasındaki 
 	
 	iletişimi belirlediği söylenebilir.
 */

// URI
/*
 		URI (Uniform Resource Identifier), internet üzerindeki kaynakları(Bu kaynaklar bir web sayfası, bir dosya, bir resim, 
 		
 	bir video veya herhangi bir diğer elektronik kaynak olabilir. URI, kaynağın tam konumunu belirlemek için kullanılır ve 
 		
 	web adreslerinin yanı sıra e-posta adresleri, dosya yolları gibi farklı türde kaynakları da belirlemek için kullanılabilir. 
 		
 	URI, genellikle URL'ler veya URN'ler olarak ifade edilir.) belirlemek için kullanılan bir adresleme sistemidir. 
 	
 	URL (Uniform Resource Locator), URI'ın bir alt kümesidir ve internet üzerindeki kaynağın tam konumunu belirtir.
 */

//@PutMapping
/*
 		@PutMapping, Spring Framework tarafından sunulan bir annotation'dır ve HTTP PUT (HTTP PUT, bir web servisi tarafından sunulan bir 
 		
 	HTTP metodu olup, belirli bir kaynağı güncelleme işlemi için kullanılır. Bu metot, kaynak üzerinde değişiklik yapmak için kullanılır 
 		
 	ve önceden mevcut olan bir kaynağın tamamını ya da bir kısmını değiştirmek için kullanılabilir.

	Örneğin, bir web servisinde bir blog yazısı kaynağı varsa, kullanıcılar HTTP PUT isteği göndererek mevcut bir blog yazısını güncelleyebilirler. 
	
	HTTP PUT isteği, kaynağın tamamını veya bir kısmını içerebilir. HTTP PUT metodunun kullanımı, kaynağı oluşturmak veya silmek için kullanılan 
	
	HTTP POST ve DELETE metodları ile birlikte, RESTful web servislerinde sıkça kullanılır.) metodunu kullanan istekleri karşılamak için kullanılır. 
 		
 	Bu annotation'ın kullanıldığı methodlar, PUT isteklerine cevap verirler. 
 */

//@DelegateMapping
/*
 		@DelegateMapping, Spring Framework 5.3 sürümünde yeni eklenen bir annotation'dır ve yönlendirme (routing) konusunda daha esnek bir yapı sağlar. 
 	
 	Bu annotation, HTTP isteklerini birçok farklı yönlendirme stratejisi ile eşleştirmek için kullanılır. Örneğin, URI path, HTTP method, 
 	
 	request parametreleri gibi farklı kriterler kullanarak istekleri farklı methodlara yönlendirebilir.
 */

//routing
/*
 		Routing, bir web uygulaması veya web sitesinde kullanılan bir terimdir ve gelen isteklerin doğru kod bloklarına veya işlevlere yönlendirilmesini sağlar.

Web uygulamaları ve siteleri genellikle birden fazla sayfa veya özellik içerir. Bu özelliklerin her biri, farklı URL'lere ve HTTP isteklerine yanıt verebilir. 

Routing, gelen istekleri, belirli bir URL'ye veya sayfaya yönlendirerek işlevselliği gerçekleştirir.

Örneğin, bir web uygulaması için ana sayfa, kullanıcı profili sayfası ve blog sayfası olabilir. Bu sayfaların her biri için farklı URL'ler atanır. 

Gelen istekler, doğru sayfaya yönlendirilir ve doğru sayfada ilgili işlemler gerçekleştirilir. Bu sayede, kullanıcılar doğru sayfaya ulaşabilir ve 

web uygulaması doğru işlevselliği sağlar.
 */