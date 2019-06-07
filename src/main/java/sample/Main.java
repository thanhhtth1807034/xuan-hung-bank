package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import stage.DepositStage;
import stage.LoginStage;
import stage.RegisterStage;
import stage.WithdrawStage;

public class Main extends Application {

    private String accountName;

    private VBox vBox;
    private HBox titleBox;
    private VBox mainBox;
    private HBox hBox;
    private VBox categoryBox;

    private Label lblTitle;
    private Label lblhome;
    private Label lblLogin;
    private Label lblRegister;
    private Label lblWithdraw;
    private Label lblDeposit;
    private Label lblBalanceValue;
    private Label lblAccountName;

    private Scene scene;
    private Stage stage;
    private LoginStage loginStage;
    private RegisterStage registerStage;
    private WithdrawStage withdrawStage;
    private DepositStage depositStage;

    private Main main;
    private int accountBalance;

    @Override
    public void start(Stage primaryStage) throws Exception{
//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
//        primaryStage.setTitle("Hello World");
//        primaryStage.setScene(new Scene(root, 300, 275));
//        primaryStage.show();
        this.main = this;
        this.stage = primaryStage;
        initComponent();

        this.scene = new Scene(this.vBox, 500, 200);
        this.stage.setScene(this.scene);
        this.stage.show();
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
        this.lblhome = new Label("Welcome To Spring Hero Bank");
        this.hBox.setAlignment(Pos.CENTER_RIGHT);
        this.hBox.setSpacing(5);
        this.hBox.setPadding(new Insets(0,40,0,0));
        this.hBox.getChildren().add(lblhome);

        this.categoryBox = new VBox();
        this.lblLogin = new Label("Login");
        this.lblRegister = new Label("Register");
        this.lblWithdraw = new Label("Withdraw");
        this.lblDeposit = new Label("Deposit");
        this.categoryBox.setAlignment(Pos.TOP_LEFT);
        this.categoryBox.setSpacing(10);
        this.categoryBox.setPadding(new Insets(-20, 0, 0, 10));
        this.categoryBox.getChildren().addAll(this.lblLogin, this.lblRegister, this.lblWithdraw, this.lblDeposit);

        this.mainBox = new VBox();
        this.mainBox.setPadding(new Insets(0));
        this.mainBox.setAlignment(Pos.CENTER);
        this.mainBox.getChildren().addAll(this.hBox, this.categoryBox);
        this.vBox = new VBox();
        this.vBox.getChildren().addAll(this.titleBox,this.mainBox);
        this.vBox.setAlignment(Pos.CENTER);
        this.vBox.setSpacing(20);
        this.vBox.setPadding(new Insets(10));

        this.loginStage = new LoginStage(main);
        this.registerStage = new RegisterStage(main);
        this.withdrawStage = new WithdrawStage(main);
        this.depositStage = new DepositStage(main);

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

        lblWithdraw.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                withdrawStage.show();
            }
        });

        lblDeposit.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                depositStage.show();
            }
        });
    }


    public static void main(String[] args) {
        launch(args);
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

    public Label getLblTitle() {
        return lblTitle;
    }

    public void setLblTitle(Label lblTitle) {
        this.lblTitle = lblTitle;
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

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public VBox getMainBox() {
        return mainBox;
    }

    public void setMainBox(VBox mainBox) {
        this.mainBox = mainBox;
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

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public Label getLblBalanceValue() {
        return lblBalanceValue;
    }

    public void setLblBalanceValue(Label lblBalanceValue) {
        this.lblBalanceValue = lblBalanceValue;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public Label getLblAccountName() {
        return lblAccountName;
    }

    public void setLblAccountName(Label lblAccountName) {
        this.lblAccountName = lblAccountName;
    }
}
