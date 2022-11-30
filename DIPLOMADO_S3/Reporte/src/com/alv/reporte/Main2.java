package com.alv.reporte;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.alv.dto.Country;
import com.alv.dto.ReporteSource;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

public class Main2 {

	private static String destFileName = "report.pdf";
	
	public static void main(String[] args) throws Exception {
		
		 System.out.println( "generating jasper report..." );

	        // 1. compile template ".jrxml" file
	        JasperReport jasperReport = getJasperReport();

	        // 2. parameters "empty"
	        Map<String, Object> parameters = getParameters();

	        // 3. datasource "java object"
	        JRDataSource dataSource = getDataSource();

	        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, 
	                parameters, 
	                dataSource);
	        JasperExportManager.exportReportToPdfFile(jasperPrint, destFileName);
		
		System.out.println("Termino!!");

	}
	private static JasperReport getJasperReport() throws FileNotFoundException, JRException {
        //File template = new File("D:\\WORKSPACE\\WORKSPACE_JAVA\\DIPLOMADO\\DIPLOMADO_S3\\Reporte\\src\\com\\alv\\recursos\\MiReporte.jrxml"); //ResourceUtils.getFile("classpath:report.jrxml");
        File template = new File("D:\\WORKSPACE\\WORKSPACE_JAVA\\DIPLOMADO\\DIPLOMADO_S3\\Reporte\\src\\com\\alv\\recursos\\ReporteCompleto.jrxml"); //ResourceUtils.getFile("classpath:report.jrxml");
        return JasperCompileManager.compileReport(template.getAbsolutePath());
        //return (JasperReport) JRLoader.loadObjectFromFile("D:\\WORKSPACE\\WORKSPACE_JAVA\\DIPLOMADO\\DIPLOMADO_S3\\Reporte\\src\\com\\alv\\recursos\\MiReporte.jasper"); 
        
    }
    private static Map<String, Object> getParameters(){
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("createdBy", "hmkcode");
        return parameters;
    }

    private static JRDataSource getDataSource(){

        List<Country> countries = new LinkedList<>();

        countries.add(new Country("IS", "Iceland", 
            "https://i.pinimg.com/originals/72/b4/49/72b44927f220151547493e528a332173.png"));
        countries.add(new Country("IS", "Iceland", "https://i.pinimg.com/originals/72/b4/49/72b44927f220151547493e528a332173.png"));
        countries.add(new Country("TR", "Turkey", "https://i.pinimg.com/originals/82/63/23/826323bba32e6e5a5996062c3a3c662f.png"));
        countries.add(new Country("ZA", "South Africa", "https://i.pinimg.com/originals/f5/c7/8d/f5c78da001b46e26481c04fb93473454.png"));
        countries.add(new Country("PL", "Poland", "https://i.pinimg.com/originals/7f/ae/21/7fae21c4854010b11127218ead743863.png"));
        countries.add(new Country("CA", "Canada", "https://i.pinimg.com/originals/4d/d4/01/4dd401733ba25e6442fc8696e04e5846.png"));

        countries.add(new Country("PA", "Panama", "https://i.pinimg.com/originals/84/dc/e4/84dce49e52ebfb5b3814393069807e0a.png"));
        countries.add(new Country("HR", "Croatia", "https://i.pinimg.com/originals/f5/8c/94/f58c94a2a2b3221328fc1e2b7acfa656.png"));
        countries.add(new Country("JP", "Japan", "https://i.pinimg.com/originals/a5/d6/88/a5d688289cd6850016f14fe93b17da01.png"));
        countries.add(new Country("DE", "Germany", "https://i.pinimg.com/originals/af/c9/b2/afc9b2592a9f1cf591e8a52256ae1e9f.png"));
        countries.add(new Country("BR", "Brazil", "https://i.pinimg.com/originals/e4/03/c4/e403c4447a3bd8940459ae4f50856bed.png"));
        // 9 other countries in GITHUB
        
        return new JRBeanCollectionDataSource(countries);
    }

}
