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
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
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
    private Stage stage;
    private WithdrawStage withdrawStage;
    private DepositStage depositStage;
    private LoginStage loginStage;
    private RegisterStage registerStage;
    private AccountModel model;
    private AccountStage accountStage;
    private Main main;//luư địa chỉ bộ nhớ

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
        this.lblTitle = new Label("Spring Hero Bank");
        this.lblTitle.setFont(Font.font(18));
        this.lblTitle.setTextFill(Color.web("#ff0cb4"));
        this.titleBox.getChildren().add(lblTitle);
//        this.titleBox.setPadding(new Insets(-50,0,0,0));
        this.titleBox.setAlignment(Pos.TOP_LEFT);


        this.hBox = new HBox();
//    this.pane = new Pane();
        this.lblhome = new Label("Welcome To Spring Hero Bank");
        this.hBox.setAlignment(Pos.CENTER_RIGHT);
        this.hBox.setSpacing(5);
        this.hBox.setPadding(new Insets(0, 40, 0, 0));
        this.hBox.getChildren().add(lblhome);

        this.categoryBox = new VBox();
        this.lblLogin = new Label("Login");
        this.lblRegister = new Label("Register");
//        this.lblWithdraw = new Label("Withdraw");
//        this.lblDeposit = new Label("Deposit");
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