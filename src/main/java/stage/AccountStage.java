package stage;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.SVGPath;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import model.AccountModel;
import sample.Main;

public class AccountStage extends Stage {

    private String accountName;
    private int accountBalance;

    private VBox vBox;
    private HBox titleBox;
    private HBox btnBox;
    private GridPane gridPaneContent;

    private Label lblTitle;
    private Label lblAcount;
    private Label lblBalance;
    private Label lblAccountName;
    private Label lblBalanceValue;
    private Button btnWithdraw;
    private Button btnDeposit;
    private VBox mainBox;
    private HBox hBox;
    private VBox categoryBox;

    private Label lblhome;
    private Label lblLogin;
    private Label lblRegister;
    private Label lblWithdraw;
    private Label lblDeposit;

    private Scene scene;
    private Scene newScene;
    private Stage stage;
    private BorderPane borderPane;
    private WithdrawStage withdrawStage;
    private DepositStage depositStage;
    private LoginStage loginStage;
    private RegisterStage registerStage;
    private AccountModel model;
    private AccountStage accountStage;
    private Main main;//luư địa chỉ bộ nhớ\

    private SVGPath logoSVG;

    private static boolean isLoggedIn = false;
    private static boolean isRegistered = false;

    public AccountStage(Main main) {
        this.model = new AccountModel();
        this.main = main;
        this.initComponent();
        this.scene = new Scene(this.vBox, 400, 200);
        this.stage = this;
        this.stage.setScene(this.scene);

    }


    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public VBox getvBox() {
        return vBox;
    }

    public void setvBox(VBox vBox) {
        this.vBox = vBox;
    }

    public HBox getTitleBox() {
        return titleBox;
    }

    public void setTitleBox(HBox titleBox) {
        this.titleBox = titleBox;
    }

    public HBox getBtnBox() {
        return btnBox;
    }

    public void setBtnBox(HBox btnBox) {
        this.btnBox = btnBox;
    }

    public GridPane getGridPaneContent() {
        return gridPaneContent;
    }

    public void setGridPaneContent(GridPane gridPaneContent) {
        this.gridPaneContent = gridPaneContent;
    }

    public Label getLblTitle() {
        return lblTitle;
    }

    public void setLblTitle(Label lblTitle) {
        this.lblTitle = lblTitle;
    }

    public Label getLblAcount() {
        return lblAcount;
    }

    public void setLblAcount(Label lblAcount) {
        this.lblAcount = lblAcount;
    }

    public Label getLblBalance() {
        return lblBalance;
    }

    public void setLblBalance(Label lblBalance) {
        this.lblBalance = lblBalance;
    }

    public Label getLblAccountName() {
        return lblAccountName;
    }

    public void setLblAccountName(Label lblAccountName) {
        this.lblAccountName = lblAccountName;
    }

    public Label getLblBalanceValue() {
        return lblBalanceValue;
    }

    public void setLblBalanceValue(Label lblBalanceValue) {
        this.lblBalanceValue = lblBalanceValue;
    }

    public Button getBtnWithdraw() {
        return btnWithdraw;
    }

    public void setBtnWithdraw(Button btnWithdraw) {
        this.btnWithdraw = btnWithdraw;
    }

    public Button getBtnDeposit() {
        return btnDeposit;
    }

    public void setBtnDeposit(Button btnDeposit) {
        this.btnDeposit = btnDeposit;
    }


    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public WithdrawStage getWithdrawStage() {
        return withdrawStage;
    }

    public void setWithdrawStage(WithdrawStage withdrawStage) {
        this.withdrawStage = withdrawStage;
    }

    public DepositStage getDepositStage() {
        return depositStage;
    }

    public void setDepositStage(DepositStage depositStage) {
        this.depositStage = depositStage;
    }

    public LoginStage getLoginStage() {
        return loginStage;
    }

    public void setLoginStage(LoginStage loginStage) {
        this.loginStage = loginStage;
    }

    public RegisterStage getRegisterStage() {
        return registerStage;
    }

    public void setRegisterStage(RegisterStage registerStage) {
        this.registerStage = registerStage;
    }

    public AccountModel getModel() {
        return model;
    }

    public void setModel(AccountModel model) {
        this.model = model;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public static boolean isIsLoggedIn() {
        return isLoggedIn;
    }

    public static void setIsLoggedIn(boolean isLoggedIn) {
        AccountStage.isLoggedIn = isLoggedIn;
    }

    public static boolean isIsRegistered() {
        return isRegistered;
    }

    public static void setIsRegistered(boolean isRegistered) {
        AccountStage.isRegistered = isRegistered;
    }


    private void initComponent() {
        this.titleBox = new HBox();
        this.logoSVG = new SVGPath();
        this.logoSVG.setFill(Color.rgb(25, 250, 250, 0.9));
        this.logoSVG.setContent("m90.906 90.533h6.321v1.049.9 1.138.001.002c0 .401.155.763.403 1.04.02.023.037.049.059.071.009.009.021.016.031.025.282.269.662.436 1.082.436h.002.083v30.273h-.085c-.87 0-1.575.705-1.575 1.575v.614.9.149h-1.403c-1.305 0-2.362 1.058-2.362 2.362v1.735.002c0 1.086.88 1.966 1.966 1.966h.002 65.142.002c1.086 0 1.966-.88 1.966-1.966 0-.001 0-.002 0-.002v-1.735c0-1.305-1.058-2.362-2.362-2.362h-1.403v-1.049-.614c0-.87-.705-1.575-1.575-1.575h-.085v-30.273h.083.001.002c.411 0 .781-.161 1.062-.418.016-.015.036-.027.052-.043.012-.012.022-.028.034-.041.263-.281.428-.656.428-1.071v-1.14.001-.001-.9-1.049h6.321c1.086 0 1.966-.88 1.966-1.966 0-.165-.027-.323-.065-.477-.003-.011-.002-.023-.005-.034-.001.003-.002.006-.003.009-.223-.841-.982-1.464-1.893-1.464h-2.555l-33.408-34.253c-.619-.635-1.642-.635-2.261 0l-33.413 34.254h-2.555c-.911 0-1.67.623-1.893 1.464-.001-.003-.002-.006-.003-.009-.003.011-.002.023-.005.034-.039.153-.065.311-.065.477 0 1.085.88 1.965 1.966 1.965zm20.521 38.023v-.9-.614c0-.87-.705-1.575-1.575-1.575h-.085v-30.272h.083.002c.42 0 .8-.167 1.083-.436.01-.009.021-.016.031-.025.02-.02.035-.043.053-.064.251-.279.409-.643.409-1.048v-.002-1.138-.9-1.049h9.472v1.049.9 1.138.002c0 .404.157.769.409 1.048.019.021.034.044.053.064.008.008.019.014.027.023.283.27.664.438 1.086.438h.002.001.082v30.273h-.085c-.87 0-1.575.705-1.575 1.575v.614.9.149h-9.472v-.15zm33.146-34.937v.002c0 .404.157.769.409 1.048.019.021.034.044.053.064.008.008.019.014.027.023.283.27.664.438 1.086.438h.002.001.083v30.273h-.085c-.87 0-1.575.705-1.575 1.575v.614.9.149h-9.474v-.149-.9-.614c0-.87-.705-1.575-1.575-1.575h-.085v-30.272h.083.002c.42 0 .8-.167 1.083-.436.01-.009.021-.016.031-.025.02-.02.035-.043.053-.064.251-.279.409-.643.409-1.048v-.002-1.138-.9-1.049h9.472v1.049.9z");
        this.titleBox.getChildren().add(logoSVG);
        this.titleBox.setAlignment(Pos.CENTER);

        this.hBox = new HBox();
//        this.borderPane = new BorderPane();
//        this.newScene = new Scene(this.borderPane, 200,100);

        this.lblhome = new Label("Welcome To Spring Hero Bank");
        this.hBox.setAlignment(Pos.CENTER_RIGHT);
        this.hBox.setSpacing(5);
        this.hBox.setPadding(new Insets(0, 40, 0, 0));
        this.hBox.getChildren().add(lblhome);

        this.categoryBox = new VBox();
        this.lblLogin = new Label("Login");
        this.lblRegister = new Label("Register");
        this.categoryBox.setAlignment(Pos.TOP_LEFT);
        this.categoryBox.setSpacing(10);
        this.categoryBox.setPadding(new Insets(-20, 0, 0, 10));
        this.categoryBox.getChildren().addAll(this.lblLogin, this.lblRegister);

        this.mainBox = new VBox();
        this.mainBox.setPadding(new Insets(0));
        this.mainBox.setAlignment(Pos.CENTER);
        this.mainBox.getChildren().addAll(this.hBox, this.categoryBox);
        this.vBox = new VBox();
        this.vBox.getChildren().addAll(this.titleBox, this.mainBox);
        this.vBox.setAlignment(Pos.CENTER);
        this.vBox.setSpacing(20);
        this.vBox.setPadding(new Insets(10));

        this.loginStage = new LoginStage(main);
        this.registerStage = new RegisterStage(main);


        lblLogin.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
//                main.setScene(newScene);
                loginStage.show();
            }
        });

        lblRegister.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                registerStage.show();
            }
        });

    }

    public VBox getMainBox() {
        return mainBox;
    }

    public void setMainBox(VBox mainBox) {
        this.mainBox = mainBox;
    }

    public HBox gethBox() {
        return hBox;
    }

    public void sethBox(HBox hBox) {
        this.hBox = hBox;
    }

    public VBox getCategoryBox() {
        return categoryBox;
    }

    public void setCategoryBox(VBox categoryBox) {
        this.categoryBox = categoryBox;
    }

    public AccountStage getAccountStage() {
        return accountStage;
    }

    public void setAccountStage(AccountStage accountStage) {
        this.accountStage = accountStage;
    }

    public Label getLblhome() {
        return lblhome;
    }

    public void setLblhome(Label lblhome) {
        this.lblhome = lblhome;
    }

    public Label getLblLogin() {
        return lblLogin;
    }

    public void setLblLogin(Label lblLogin) {
        this.lblLogin = lblLogin;
    }

    public Label getLblRegister() {
        return lblRegister;
    }

    public void setLblRegister(Label lblRegister) {
        this.lblRegister = lblRegister;
    }

    public Label getLblWithdraw() {
        return lblWithdraw;
    }

    public void setLblWithdraw(Label lblWithdraw) {
        this.lblWithdraw = lblWithdraw;
    }

    public Label getLblDeposit() {
        return lblDeposit;
    }

    public void setLblDeposit(Label lblDeposit) {
        this.lblDeposit = lblDeposit;
    }
}