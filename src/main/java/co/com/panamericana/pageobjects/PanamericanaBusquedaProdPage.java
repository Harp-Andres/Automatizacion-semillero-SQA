package co.com.panamericana.pageobjects;

import org.openqa.selenium.By;

public class PanamericanaBusquedaProdPage {

    private static By txtBarraBusqueda = By.className("fulltext-search-box");
    private static By urlSmartWatch = By.xpath("//a[@class='item__showcase__category__figure__link' and @href='https://www.panamericana.com.co/smartwatch-slide-redondo-negro-y-miel-629458/p']");
    private static By lblSmartWatch = By.xpath("//h1[contains(text(), 'Smartwatch Slide redondo color negro y miel')]");
    private static By imgCategoriaLibros = By.xpath("//img[@data-hover='/arquivos/categoria-libros-icono-new.png?v=637439045156570000']");
    private static By imgCategoriaLiteratura = By.xpath("//img[@src='/arquivos/icon-categoria-literatura-1-febrero-2022.png?v=637792390716000000']");
    private static By btnCargasMasProductos = By.xpath("//button[@class='smartFilter__loadMoreContent__btn animated-button']");
    private static By urlLibroSeleccionado = By.xpath("//a[@href='https://www.panamericana.com.co/12-relatos-impuros-632253/p' and @class='item__showcase__category__figure__link']");
    private static By lblLibroSeleccionado = By.xpath("//h1[@id='titleProduct']");
    private static By btnMenu = By.className("header__meu");
    private static By linkTecnologia = By.xpath("//a[@href='/tecnologia?utmi_cp=menuprincipal&utmi_pc=mpdeptecnologia&utmi_p=mptecnologia']");
    private static By linkPortatiles = By.xpath("//a[@href='/tecnologia/computadores-y-tablets/portatiles?O=OrderByBestDiscountDESC']");
    private static By urlPortatilSeleccionado = By.xpath("//a[@href='https://www.panamericana.com.co/portatil-acer-gaming-intel-core-i5-ram-8gb-512gb-ssd-an515-55-54y1-15-6-negro-632670/p' and @class='item__showcase__category__figure__link']");
    private static By lblPortatilSeleccionado = By.id("titleProduct");


    public static By getUrlSmartWatch() {
        return urlSmartWatch;
    }

    public static By getTxtBarraBusqueda() {
        return txtBarraBusqueda;
    }

    public static By getLblSmartWatch() {
        return lblSmartWatch;
    }

    public static By getImgCategoriaLibros() {
        return imgCategoriaLibros;
    }

    public static By getImgCategoriaLiteratura() {
        return imgCategoriaLiteratura;
    }

    public static By getBtnCargasMasProductos() {
        return btnCargasMasProductos;
    }

    public static By getUrlLibroSeleccionado() {
        return urlLibroSeleccionado;
    }

    public static By getLblLibroSeleccionado() {
        return lblLibroSeleccionado;
    }

    public static By getBtnMenu() {
        return btnMenu;
    }

    public static By getLinkTecnologia() {
        return linkTecnologia;
    }

    public static By getLinkPortatiles() {
        return linkPortatiles;
    }

    public static By getUrlPortatilSeleccionado() {
        return urlPortatilSeleccionado;
    }

    public static By getLblPortatilSeleccionado() {
        return lblPortatilSeleccionado;
    }
}
