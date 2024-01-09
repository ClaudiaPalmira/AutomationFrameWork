package ShareData.Browser;

public interface BrowserService {
    void openBrowser(Boolean cicd);
    void closeBrowser();
    Object prepareBrowserOptions(Boolean cicd); //metoda cu return (UN RETURN GENERIC PENTRU A SE PLIA PE ORICE BROWSER) care returneaza un obiect
}
