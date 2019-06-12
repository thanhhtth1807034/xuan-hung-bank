package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.SVGPath;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import stage.*;

import javax.swing.*;

public class Main extends Application {

    private String accountName;
    private String userID;

    private VBox vBox;
    private HBox titleBox;
    private VBox mainBox;
    private HBox hBox;
    private VBox categoryBox;

    private GridPane gridPaneContent;
    private Label lblAcount;
    private Label lblBalance;
    private Label lblAccountName;
    private Label lblBalanceValue;
    private Label lblTitle;
    private Label lblhome;
    private Label lblLogin;
    private Label lblRegister;
    private Label lblWithdraw;
    private Label lblDeposit;
    private Label lblTransfer;
    private HBox btnBox;
    private SVGPath logoSVG;

    private Pane pane;
    private Scene scene;
    private Stage stage;
    private LoginStage loginStage;
    private RegisterStage registerStage;
    private WithdrawStage withdrawStage;
    private DepositStage depositStage;
    private TransferStage transferStage;
    private EditStage editStage;
    private BorderPane borderPane;
    private Scene newScene;

    private Button btnEdit;

    private Main main;
    private int accountBalance;

    private static boolean isLoggedIn = false;

    private AccountStage accountStage;

    @Override
    public void start(Stage primaryStage) throws Exception {
//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
//        primaryStage.setTitle("Hello World");
//        primaryStage.setScene(new Scene(root, 300, 275));
//        primaryStage.show();
        this.main = this;
        this.stage = primaryStage;
        initComponent();


        if (isLoggedIn) {
            // show stage.

            this.stage.show();

        } else {
            this.accountStage = new AccountStage(this);
            this.accountStage.show();

        }
//        this.stage.initStyle(StageStyle.TRANSPARENT);

        this.scene = new Scene(this.vBox, 500, 400);
//        this.scene.getStylesheets().add("style.css");
        this.stage.setScene(this.scene);

    }


    private void initComponent() {
        this.vBox = new VBox();

        this.titleBox = new HBox();
        this.logoSVG = new SVGPath();
        this.logoSVG.setFill(Color.rgb(25, 250, 250, 0.9));
        this.logoSVG.setContent("m90.906 90.533h6.321v1.049.9 1.138.001.002c0 .401.155.763.403 1.04.02.023.037.049.059.071.009.009.021.016.031.025.282.269.662.436 1.082.436h.002.083v30.273h-.085c-.87 0-1.575.705-1.575 1.575v.614.9.149h-1.403c-1.305 0-2.362 1.058-2.362 2.362v1.735.002c0 1.086.88 1.966 1.966 1.966h.002 65.142.002c1.086 0 1.966-.88 1.966-1.966 0-.001 0-.002 0-.002v-1.735c0-1.305-1.058-2.362-2.362-2.362h-1.403v-1.049-.614c0-.87-.705-1.575-1.575-1.575h-.085v-30.273h.083.001.002c.411 0 .781-.161 1.062-.418.016-.015.036-.027.052-.043.012-.012.022-.028.034-.041.263-.281.428-.656.428-1.071v-1.14.001-.001-.9-1.049h6.321c1.086 0 1.966-.88 1.966-1.966 0-.165-.027-.323-.065-.477-.003-.011-.002-.023-.005-.034-.001.003-.002.006-.003.009-.223-.841-.982-1.464-1.893-1.464h-2.555l-33.408-34.253c-.619-.635-1.642-.635-2.261 0l-33.413 34.254h-2.555c-.911 0-1.67.623-1.893 1.464-.001-.003-.002-.006-.003-.009-.003.011-.002.023-.005.034-.039.153-.065.311-.065.477 0 1.085.88 1.965 1.966 1.965zm20.521 38.023v-.9-.614c0-.87-.705-1.575-1.575-1.575h-.085v-30.272h.083.002c.42 0 .8-.167 1.083-.436.01-.009.021-.016.031-.025.02-.02.035-.043.053-.064.251-.279.409-.643.409-1.048v-.002-1.138-.9-1.049h9.472v1.049.9 1.138.002c0 .404.157.769.409 1.048.019.021.034.044.053.064.008.008.019.014.027.023.283.27.664.438 1.086.438h.002.001.082v30.273h-.085c-.87 0-1.575.705-1.575 1.575v.614.9.149h-9.472v-.15zm33.146-34.937v.002c0 .404.157.769.409 1.048.019.021.034.044.053.064.008.008.019.014.027.023.283.27.664.438 1.086.438h.002.001.083v30.273h-.085c-.87 0-1.575.705-1.575 1.575v.614.9.149h-9.474v-.149-.9-.614c0-.87-.705-1.575-1.575-1.575h-.085v-30.272h.083.002c.42 0 .8-.167 1.083-.436.01-.009.021-.016.031-.025.02-.02.035-.043.053-.064.251-.279.409-.643.409-1.048v-.002-1.138-.9-1.049h9.472v1.049.9z");
        this.titleBox.getChildren().add(logoSVG);
        this.titleBox.setAlignment(Pos.CENTER);
        this.titleBox.setSpacing(10);

        this.gridPaneContent = new GridPane();
        this.lblAcount = new Label("Account:");
        this.lblBalance = new Label("Balance:");
        this.lblAccountName = new Label(this.accountName);
        this.lblBalanceValue = new Label(String.valueOf(this.accountBalance));
        this.btnEdit = new Button("Edit");
        this.gridPaneContent.add(this.lblAcount, 0, 0);
        this.gridPaneContent.add(this.lblAccountName, 1, 0);
        this.gridPaneContent.add(this.lblBalance, 0, 1);
        this.gridPaneContent.add(this.lblBalanceValue, 1, 1);
        this.gridPaneContent.add(this.btnEdit, 1, 2);
        this.gridPaneContent.setAlignment(Pos.CENTER);
        this.gridPaneContent.setPadding(new Insets(0));
        this.gridPaneContent.setVgap(10);
        this.gridPaneContent.setHgap(10);


        this.categoryBox = new VBox();
        this.lblLogin = new Label("Login");
        this.lblRegister = new Label("Register");
        this.lblWithdraw = new Label("Withdraw");
        this.lblDeposit = new Label("Deposit");
        this.lblTransfer = new Label("Transfer");
        this.categoryBox.setAlignment(Pos.TOP_LEFT);
        this.categoryBox.setSpacing(10);
        this.categoryBox.setPadding(new Insets(-95, 0, 0, 20));
        this.categoryBox.getChildren().addAll(this.lblLogin, this.lblRegister, this.lblWithdraw, this.lblDeposit, this.lblTransfer);

        this.mainBox = new VBox();
        this.mainBox.setPadding(new Insets(0));
        this.mainBox.setAlignment(Pos.CENTER);
        this.mainBox.getChildren().addAll(this.gridPaneContent, this.categoryBox);

        this.vBox.getChildren().addAll(this.titleBox, this.mainBox);
        this.vBox.setAlignment(Pos.CENTER);
        this.vBox.setSpacing(30);
        this.vBox.setPadding(new Insets(10, 10, 10, 10));

        this.editStage = new EditStage(main);
        btnEdit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                editStage.showAndWait();
            }
        });


        this.loginStage = new LoginStage(main);
        this.registerStage = new RegisterStage(main);
        this.withdrawStage = new WithdrawStage(main);
        this.depositStage = new DepositStage(main);
        this.transferStage = new TransferStage(main);

        lblLogin.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
//                setUserAgentStylesheet(STYLESHEET_CASPIAN);
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

        lblTransfer.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                transferStage.show();
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

    public GridPane getGridPaneContent() {
        return gridPaneContent;
    }

    public void setGridPaneContent(GridPane gridPaneContent) {
        this.gridPaneContent = gridPaneContent;
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

    public HBox getBtnBox() {
        return btnBox;
    }

    public void setBtnBox(HBox btnBox) {
        this.btnBox = btnBox;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public Label getLblTransfer() {
        return lblTransfer;
    }

    public void setLblTransfer(Label lblTransfer) {
        this.lblTransfer = lblTransfer;
    }

    public SVGPath getLogoSVG() {
        return logoSVG;
    }

    public void setLogoSVG(SVGPath logoSVG) {
        this.logoSVG = logoSVG;
    }

    public TransferStage getTransferStage() {
        return transferStage;
    }

    public void setTransferStage(TransferStage transferStage) {
        this.transferStage = transferStage;
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

    public Pane getPane() {
        return pane;
    }

    public void setPane(Pane pane) {
        this.pane = pane;
    }

    public static boolean isIsLoggedIn() {
        return isLoggedIn;
    }

    public static void setIsLoggedIn(boolean isLoggedIn) {
        Main.isLoggedIn = isLoggedIn;
    }

    public Button getBtnEdit() {
        return btnEdit;
    }

    public void setBtnEdit(Button btnEdit) {
        this.btnEdit = btnEdit;
    }

    public AccountStage getAccountStage() {
        return accountStage;
    }

    public void setAccountStage(AccountStage accountStage) {
        this.accountStage = accountStage;
    }

    public EditStage getEditStage() {
        return editStage;
    }

    public void setEditStage(EditStage editStage) {
        this.editStage = editStage;
    }

}
