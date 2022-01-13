package sample;

import javafx.animation.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.util.Duration;
import javax.swing.*;
import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import static java.lang.Thread.sleep;

//This is the AP Project made by Shivam Agrawal and Shivansh Mittal,
//students of IIITD. The game made is called "Will Hero".

public class Controller extends JPanel implements Initializable{
    @FXML
    private ImageView warrior;
    @FXML
    private ImageView island1;
    @FXML
    private ImageView island2;
    @FXML
    private ImageView island3;
    @FXML
    private ImageView island4;
    @FXML
    private ImageView island5;
    @FXML
    private ImageView island6;
    @FXML
    private ImageView island7;
    @FXML
    private ImageView island8;
    @FXML
    private ImageView island9;
    @FXML
    private ImageView island10;
    @FXML
    private ImageView island11;
    @FXML
    private ImageView island12;
    @FXML
    private ImageView island13;
    @FXML
    private ImageView island14;
    @FXML
    private ImageView island15;
    @FXML
    private ImageView island16;
    @FXML
    private ImageView island17;
    @FXML
    private ImageView island18;
    @FXML
    private ImageView island19;
    @FXML
    private ImageView island20;
    @FXML
    private ImageView island21;
    @FXML
    private ImageView island22;
    @FXML
    private ImageView island23;
    @FXML
    private ImageView island24;
    @FXML
    private ImageView island25;
    @FXML
    private ImageView island26;
    @FXML
    private ImageView island27;
    @FXML
    private ImageView island28;
    @FXML
    private ImageView island29;
    @FXML
    private ImageView island30;
    @FXML
    private ImageView island31;
    @FXML
    private ImageView island32;

    public ArrayList<ImageView> island_list = new ArrayList<ImageView>();

    @FXML
    private Group back_components;
    @FXML
    private ImageView TNT1;
    @FXML
    private ImageView TNT2;
    @FXML
    private ImageView TNT3;
    @FXML
    private ImageView TNT4;
    @FXML
    private ImageView TNT5;
    @FXML
    private ImageView TNT6;
    @FXML
    private ImageView TNT7;
    @FXML
    private ImageView TNT8;
    @FXML
    private ImageView chest1;
    @FXML
    private ImageView chest2;
    @FXML
    private ImageView chest3;
    @FXML
    private ImageView green_orc1;
    @FXML
    private ImageView green_orc2;
    @FXML
    private ImageView green_orc3;
    @FXML
    private ImageView green_orc4;
    @FXML
    private ImageView green_orc5;
    @FXML
    private ImageView green_orc6;
    @FXML
    private ImageView green_orc7;
    @FXML
    private ImageView green_orc8;
    @FXML
    private ImageView green_orc9;
    @FXML
    private ImageView green_orc10;
    @FXML
    private ImageView green_orc11;
    @FXML
    private ImageView red_orc1;
    @FXML
    private ImageView red_orc2;
    @FXML
    private ImageView red_orc3;
    @FXML
    private ImageView red_orc4;
    @FXML
    private ImageView red_orc5;
    @FXML
    private ImageView red_orc6;
    @FXML
    private ImageView red_orc7;
    @FXML
    private ImageView red_orc8;
    @FXML
    private ImageView red_orc15;
    @FXML
    private ImageView red_orc9;
    @FXML
    private ImageView red_orc10;
    @FXML
    private ImageView red_orc11;
    @FXML
    private ImageView king_orc;
    @FXML
    private ImageView coin1;
    @FXML
    private ImageView coin2;
    @FXML
    private ImageView coin3;
    @FXML
    private ImageView coin4;
    @FXML
    private ImageView coin5;
    @FXML
    private ImageView coin6;
    @FXML
    private ImageView coin7;
    @FXML
    private ImageView coin8;
    @FXML
    private ImageView coin9;
    @FXML
    private ImageView coin10;
    @FXML
    private ImageView coin11;
    @FXML
    private ImageView coin12;
    @FXML
    private ImageView coin13;
    @FXML
    private ImageView coin14;
    @FXML
    private ImageView coin15;
    @FXML
    private ImageView coin16;
    @FXML
    private ImageView coin17;
    @FXML
    private ImageView coin18;
    @FXML
    private ImageView coin19;

    @FXML
    private ImageView BCR;

    @FXML
    private Button b1;

    @FXML
    private Button exit;

    @FXML
    private ImageView burried;

    @FXML
    private ImageView blasted;

    @FXML
    private ImageView falling;
    @FXML
    private ImageView axe;
    @FXML
    private ImageView sword;

    public ArrayList<ImageView> jump_objects = new ArrayList<ImageView>();
    @FXML
    private Label score;
    @FXML
    private Label coin;





    private Stage primaryStage;
    private static boolean not_saved_yet=true;

    Warrior hero = new Warrior();
    Game someGame = Game.getinstance();


    Green_orc gr1 = new Green_orc(25, green_orc1);
    Green_orc gr2 = new Green_orc(25, green_orc2);
    Green_orc gr3 = new Green_orc(25, green_orc3);
    Green_orc gr4 = new Green_orc(25, green_orc4);
    Green_orc gr5 = new Green_orc(25, green_orc5);
    Green_orc gr6 = new Green_orc(25, green_orc6);
    Green_orc gr7 = new Green_orc(25, green_orc7);
    Green_orc gr8 = new Green_orc(25, green_orc8);
    Green_orc gr9 = new Green_orc(25, green_orc9);
    Green_orc gr10 = new Green_orc(25, green_orc10);
    Green_orc gr11 = new Green_orc(25, green_orc11);

    Red_Orc ro1 = new Red_Orc(25, red_orc1);
    Red_Orc ro2 = new Red_Orc(25, red_orc2);
    Red_Orc ro3 = new Red_Orc(25, red_orc3);
    Red_Orc ro4 = new Red_Orc(25, red_orc4);
    Red_Orc ro5 = new Red_Orc(25, red_orc5);
    Red_Orc ro6 = new Red_Orc(25, red_orc6);
    Red_Orc ro7 = new Red_Orc(25, red_orc7);
    Red_Orc ro8 = new Red_Orc(25, red_orc8);
    Red_Orc ro9 = new Red_Orc(25, red_orc9);
    Red_Orc ro10 = new Red_Orc(25, red_orc10);
    Red_Orc ro11 = new Red_Orc(25, red_orc11);
    Red_Orc ro15 = new Red_Orc(25, red_orc11);
    Coin_Chest c1 = new Coin_Chest(chest1);

    Weapon_Chest w1 = new Weapon_Chest(chest2,1);
    Weapon_Chest w2 = new Weapon_Chest(chest3,2);

    Boss_Orc bo = new Boss_Orc(100, king_orc);
    static int game_score=0;
    static int game_coins=0;
    static Double x_co=112.0;
    static Double x_back=-4.0;
    static int x_layout_warrior;
    static int x_layout_back;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        game_score = someGame.getW().getScore();
        game_coins = someGame.getW().getCoins();
        score.setText("Score : "+someGame.getW().getScore());
        coin.setText("Coins : "+someGame.getW().getCoins());
        warrior.setLayoutX(someGame.getX());
        warrior.setLayoutY(someGame.getY());
        hero.setAlive(someGame.getNot_saved());
        hero.setW_status(someGame.getW_status());
        if(hero.getW_status() == 1){
            sword.setVisible(true);
            sword.setLayoutX(someGame.getX() + 38);
            axe.setLayoutX(someGame.getX() + 4);
        }
        else{
            sword.setVisible(false);
            sword.setLayoutX(someGame.getX() + 38);
            axe.setLayoutX(someGame.getX() + 4);
        }
        if (hero.getW_status() == 2){
            sword.setVisible(false);
            axe.setVisible(true);
            sword.setLayoutX(someGame.getX() + 38);
            axe.setLayoutX(someGame.getX() + 4);
        }
        else{
            axe.setVisible(false);
            sword.setLayoutX(someGame.getX() + 38);
            axe.setLayoutX(someGame.getX() + 4);
        }

        back_components.setLayoutX(someGame.getX_back());
        BCR.setVisible(false);
        b1.setVisible(false);

        exit.setVisible(false);
        burried.setVisible(false);
        blasted.setVisible(false);
        falling.setVisible(false);
        island_list.add(island1);
        hero.warrior_jump(warrior);
        hero.warrior_jump(sword);
        hero.warrior_jump(axe);

        rotate_image(coin1);
        rotate_image(coin2);
        rotate_image(coin3);
        rotate_image(coin4);
        rotate_image(coin5);
        rotate_image(coin6);
        rotate_image(coin7);
        rotate_image(coin8);
        rotate_image(coin9);
        rotate_image(coin10);
        rotate_image(coin11);
        rotate_image(coin12);
        rotate_image(coin13);
        rotate_image(coin14);
        rotate_image(coin15);
        rotate_image(coin16);
        rotate_image(coin17);
        rotate_image(coin18);
        rotate_image(coin19);
        move_axe();
        rotate_axe();
        island_list.add(island2);
        island_list.add(island3);
        island_list.add(island4);
        island_list.add(island5);
        island_list.add(island6);
        island_list.add(island7);
        island_list.add(island8);
        island_list.add(island9);
        island_list.add(island10);
        island_list.add(island11);
        island_list.add(island12);
        island_list.add(island13);
        island_list.add(island14);
        island_list.add(island15);
        island_list.add(island16);
        island_list.add(island17);
        island_list.add(island18);
        island_list.add(island19);
        island_list.add(island20);
        island_list.add(island21);
        island_list.add(island22);
        island_list.add(island23);
        island_list.add(island24);
        island_list.add(island25);
        island_list.add(island26);
        island_list.add(island27);
        island_list.add(island28);
        island_list.add(island29);
        island_list.add(island30);
        island_list.add(island31);
        island_list.add(island32);

        jump_objects.add(warrior);
        jump_objects.add(green_orc1);
        jump_objects.add(green_orc2);
        jump_objects.add(green_orc3);
        jump_objects.add(green_orc4);
        jump_objects.add(green_orc5);
        jump_objects.add(green_orc6);
        jump_objects.add(green_orc7);
        jump_objects.add(green_orc8);
        jump_objects.add(green_orc9);
        jump_objects.add(green_orc10);
        jump_objects.add(green_orc11);
        jump_objects.add(red_orc1);
        jump_objects.add(red_orc2);
        jump_objects.add(red_orc3);
        jump_objects.add(red_orc4);
        jump_objects.add(red_orc5);
        jump_objects.add(red_orc6);
        jump_objects.add(red_orc7);
        jump_objects.add(red_orc8);
        jump_objects.add(red_orc9);
        jump_objects.add(red_orc10);
        jump_objects.add(red_orc11);
        jump_objects.add(king_orc);

        gr1.orc_jump(green_orc1);
        gr2.orc_jump(green_orc2);
        gr3.orc_jump(green_orc3);
        gr4.orc_jump(green_orc4);
        gr5.orc_jump(green_orc5);
        gr6.orc_jump(green_orc6);
        gr7.orc_jump(green_orc7);
        gr8.orc_jump(green_orc8);
        gr9.orc_jump(green_orc9);
        gr10.orc_jump(green_orc10);
        gr11.orc_jump(green_orc11);

        ro1.orc_jump(red_orc1);
        ro2.orc_jump(red_orc2);
        ro3.orc_jump(red_orc3);
        ro4.orc_jump(red_orc4);
        ro5.orc_jump(red_orc5);
        ro6.orc_jump(red_orc6);
        ro7.orc_jump(red_orc7);
        ro8.orc_jump(red_orc8);
        ro9.orc_jump(red_orc9);
        ro10.orc_jump(red_orc10);
        ro11.orc_jump(red_orc11);
        ro15.orc_jump(red_orc15);
        bo.orc_jump(king_orc);
        collisionTimer.start();
    }



    AnimationTimer collisionTimer=new AnimationTimer() {
        @Override
        public void handle(long l){
            try {
                collisiontry(warrior,green_orc1, gr1);
                collisiontry(warrior,green_orc2, gr2);
                collisiontry(warrior,green_orc3, gr3);
                collisiontry(warrior,green_orc4, gr4);
                collisiontry(warrior,green_orc5, gr5);
                collisiontry(warrior,green_orc6, gr6);
                collisiontry(warrior,green_orc7, gr7);
                collisiontry(warrior,green_orc8, gr8);
                collisiontry(warrior,green_orc9, gr9);
                collisiontry(warrior,green_orc10, gr10);
                collisiontry(warrior,green_orc11, gr11);
                collision_chest(warrior,chest1,c1);
                collision_chest(warrior,chest2,w1);
                collision_chest(warrior,chest3,w2);
                collisiontry(warrior, red_orc1, ro1);
                collisiontry(warrior, red_orc2, ro2);
                collisiontry(warrior, red_orc3, ro3);
                collisiontry(warrior, red_orc4, ro4);
                collisiontry(warrior, red_orc5, ro5);
                collisiontry(warrior, red_orc6, ro6);
                collisiontry(warrior, red_orc7, ro7);
                collisiontry(warrior, red_orc8, ro8);
                collisiontry(warrior, red_orc9, ro9);
                collisiontry(warrior, red_orc10, ro10);
                collisiontry(warrior, red_orc11, ro11);
                collisiontry(warrior, red_orc15, ro15);
                collisiontry(warrior, king_orc, bo);
            }
            catch (InterruptedException | IOException e) {
                e.printStackTrace();
            }

            collision_tnt(warrior, TNT1);
            collision_tnt(warrior, TNT2);
            collision_tnt(warrior, TNT3);
            collision_tnt(warrior, TNT5);
            collision_tnt(warrior, TNT6);
            collision_tnt(warrior, TNT7);
            collision_tnt(warrior, TNT8);
            collision_coin(warrior,coin1);
            collision_coin(warrior,coin2);
            collision_coin(warrior,coin3);
            collision_coin(warrior,coin4);
            collision_coin(warrior,coin5);
            collision_coin(warrior,coin6);
            collision_coin(warrior,coin7);
            collision_coin(warrior,coin8);
            collision_coin(warrior,coin9);
            collision_coin(warrior,coin10);
            collision_coin(warrior,coin11);
            collision_coin(warrior,coin12);
            collision_coin(warrior,coin13);
            collision_coin(warrior,coin14);
            collision_coin(warrior,coin15);
            collision_coin(warrior,coin15);
            collision_coin(warrior,coin16);
            collision_coin(warrior,coin17);
            collision_coin(warrior,coin18);
            collision_coin(warrior,coin19);
            x_layout_warrior = (int) warrior.getLayoutX();
            x_layout_back = (int) back_components.getLayoutX();
            if((warrior.getBoundsInParent().getMinX() > 489 )&&(warrior.getBoundsInParent().getMaxX() < 533))  {
                if(warrior.getBoundsInParent().getMaxY() > 224) {
                    hero.warrior_jump_down(warrior);
                    if (warrior.getBoundsInParent().getMaxY() > 400) {
                        falling.setVisible(true);
                        if (hero.getAlive()) {
                            b1.setVisible(true);
                            b1.setDisable(false);
                        }
                        exit.setVisible(true);
                        exit.setDisable(false);
                    }
                }
            }
            if((warrior.getBoundsInParent().getMinX() > 667 )&&(warrior.getBoundsInParent().getMaxX() < 740))  {
                if(warrior.getBoundsInParent().getMaxY() > 224) {
                    hero.warrior_jump_down(warrior);
                    if (warrior.getBoundsInParent().getMaxY() > 400) {
                        falling.setVisible(true);
                        if (hero.getAlive()) {
                            b1.setVisible(true);
                            b1.setDisable(false);
                        }
                        exit.setVisible(true);
                        exit.setDisable(false);
                    }
                }
            }
            if((warrior.getBoundsInParent().getMinX() > 916 )&&(warrior.getBoundsInParent().getMaxX() < 981))  {
                if(warrior.getBoundsInParent().getMaxY() > 224) {
                    hero.warrior_jump_down(warrior);
                    if (warrior.getBoundsInParent().getMaxY() > 400) {
                        falling.setVisible(true);
                        if (hero.getAlive()) {
                            b1.setVisible(true);
                            b1.setDisable(false);
                        }
                        exit.setVisible(true);
                        exit.setDisable(false);
                    }
                }
            }
            if((warrior.getBoundsInParent().getMinX() > 1300 )&&(warrior.getBoundsInParent().getMaxX() < 1333))  {
                if(warrior.getBoundsInParent().getMaxY() > 224) {
                    hero.warrior_jump_down(warrior);
                    if (warrior.getBoundsInParent().getMaxY() > 400) {
                        falling.setVisible(true);
                        if (hero.getAlive()) {
                            b1.setVisible(true);
                            b1.setDisable(false);
                        }
                        exit.setVisible(true);
                        exit.setDisable(false);
                    }
                }
            }
            if((warrior.getBoundsInParent().getMinX() > 1834)&&(warrior.getBoundsInParent().getMaxX() < 1840))  {
                if(warrior.getBoundsInParent().getMaxY() > 224) {
                    hero.warrior_jump_down(warrior);
                    if (warrior.getBoundsInParent().getMaxY() > 400) {
                        falling.setVisible(true);
                        if (hero.getAlive()) {
                            b1.setVisible(true);
                            b1.setDisable(false);
                        }
                        exit.setVisible(true);
                        exit.setDisable(false);
                    }
                }
            }
            if((warrior.getBoundsInParent().getMinX() > 1940 )&&(warrior.getBoundsInParent().getMaxX() < 1972))  {
                if(warrior.getBoundsInParent().getMaxY() > 224) {
                    hero.warrior_jump_down(warrior);
                    if (warrior.getBoundsInParent().getMaxY() > 400) {
                        falling.setVisible(true);
                        if (hero.getAlive()) {
                            b1.setVisible(true);
                            b1.setDisable(false);
                        }
                        exit.setVisible(true);
                        exit.setDisable(false);
                    }
                }
            }
            if((warrior.getBoundsInParent().getMinX() > 2132 )&&(warrior.getBoundsInParent().getMaxX() < 2171))  {
                if(warrior.getBoundsInParent().getMaxY() > 224) {
                    hero.warrior_jump_down(warrior);
                    if (warrior.getBoundsInParent().getMaxY() > 400) {
                        falling.setVisible(true);
                        if (hero.getAlive()) {
                            b1.setVisible(true);
                            b1.setDisable(false);
                        }
                        exit.setVisible(true);
                        exit.setDisable(false);
                    }
                }

            }
            if((warrior.getBoundsInParent().getMinX() > 2286 )&&(warrior.getBoundsInParent().getMaxX() < 2325))  {
                if(warrior.getBoundsInParent().getMaxY() > 224) {
                    hero.warrior_jump_down(warrior);
                    if (warrior.getBoundsInParent().getMaxY() > 400) {
                        falling.setVisible(true);
                        if (hero.getAlive()) {
                            b1.setVisible(true);
                            b1.setDisable(false);
                        }
                        exit.setVisible(true);
                        exit.setDisable(false);
                    }
                }
            }
            if((warrior.getBoundsInParent().getMaxX() > 2579 )&&(warrior.getBoundsInParent().getMinX() < 2608))  {
                if(warrior.getBoundsInParent().getMaxY() > 224) {
                    hero.warrior_jump_down(warrior);
                    if (warrior.getBoundsInParent().getMaxY() > 400) {
                        falling.setVisible(true);
                        if (hero.getAlive()) {
                            b1.setVisible(true);
                            b1.setDisable(false);
                        }
                        exit.setVisible(true);
                        exit.setDisable(false);
                    }
                }
            }
            if((warrior.getBoundsInParent().getMaxX() > 3050 )&&(warrior.getBoundsInParent().getMinX() < 3084))  {
                if(warrior.getBoundsInParent().getMaxY() > 224) {
                    hero.warrior_jump_down(warrior);
                    if (warrior.getBoundsInParent().getMaxY() > 400) {
                        falling.setVisible(true);
                        if (hero.getAlive()) {
                            b1.setVisible(true);
                            b1.setDisable(false);
                        }
                        exit.setVisible(true);
                        exit.setDisable(false);
                    }
                }
            }
            if((warrior.getBoundsInParent().getMaxX() > 3290)&&(warrior.getBoundsInParent().getMinX() < 3315))  {
                if(warrior.getBoundsInParent().getMaxY() > 224) {
                    hero.warrior_jump_down(warrior);
                    if (warrior.getBoundsInParent().getMaxY() > 400) {
                        falling.setVisible(true);
                        if (hero.getAlive()) {
                            b1.setVisible(true);
                            b1.setDisable(false);
                        }
                        exit.setVisible(true);
                        exit.setDisable(false);
                    }
                }
            }
            if((warrior.getBoundsInParent().getMinX() > 3489 )&&(warrior.getBoundsInParent().getMaxX() < 3542))  {
                if(warrior.getBoundsInParent().getMaxY() > 224) {
                    hero.warrior_jump_down(warrior);
                    if (warrior.getBoundsInParent().getMaxY() > 400) {
                        falling.setVisible(true);
                        if (hero.getAlive()) {
                            b1.setVisible(true);
                            b1.setDisable(false);
                        }
                        exit.setVisible(true);
                        exit.setDisable(false);
                    }
                }
            }
            if((warrior.getBoundsInParent().getMinX() > 3692 )&&(warrior.getBoundsInParent().getMaxX() < 3720))  {
                if(warrior.getBoundsInParent().getMaxY() > 224) {
                    hero.warrior_jump_down(warrior);
                    if (warrior.getBoundsInParent().getMaxY() > 400) {
                        falling.setVisible(true);
                        if (hero.getAlive()) {
                            b1.setVisible(true);
                            b1.setDisable(false);
                        }
                        exit.setVisible(true);
                        exit.setDisable(false);
                    }
                }
            }
            if((warrior.getBoundsInParent().getMinX() > 3890 )&&(warrior.getBoundsInParent().getMaxX() < 3905))  {
                if(warrior.getBoundsInParent().getMaxY() > 224) {
                    hero.warrior_jump_down(warrior);
                    if (warrior.getBoundsInParent().getMaxY() > 400) {
                        falling.setVisible(true);
                        if (hero.getAlive()) {
                            b1.setVisible(true);
                            b1.setDisable(false);
                        }
                        exit.setVisible(true);
                        exit.setDisable(false);
                    }
                }
            }
            if((warrior.getBoundsInParent().getMinX() > 4005 )&&(warrior.getBoundsInParent().getMaxX() < 4007))  {
                if(warrior.getBoundsInParent().getMaxY() > 224) {
                    hero.warrior_jump_down(warrior);
                    if (warrior.getBoundsInParent().getMaxY() > 400) {
                        falling.setVisible(true);
                        if (hero.getAlive()) {
                            b1.setVisible(true);
                            b1.setDisable(false);
                        }
                        exit.setVisible(true);
                        exit.setDisable(false);
                    }
                }
            }
            if((warrior.getBoundsInParent().getMinX() > 4405 )&&(warrior.getBoundsInParent().getMaxX() < 4443))  {
                if(warrior.getBoundsInParent().getMaxY() > 224) {
                    hero.warrior_jump_down(warrior);
                    if (warrior.getBoundsInParent().getMaxY() > 400) {
                        falling.setVisible(true);
                        if (hero.getAlive()) {
                            b1.setVisible(true);
                            b1.setDisable(false);
                        }
                        exit.setVisible(true);
                        exit.setDisable(false);
                    }
                }
            }
            if((warrior.getBoundsInParent().getMinX() > 4560 )&&(warrior.getBoundsInParent().getMaxX() < 4579))  {
                if(warrior.getBoundsInParent().getMaxY() > 224) {
                    hero.warrior_jump_down(warrior);
                    if (warrior.getBoundsInParent().getMaxY() > 400) {
                        falling.setVisible(true);
                        if (hero.getAlive()) {
                            b1.setVisible(true);
                            b1.setDisable(false);
                        }
                        exit.setVisible(true);
                        exit.setDisable(false);
                    }
                }
            }
            if((warrior.getBoundsInParent().getMinX() > 4760 )&&(warrior.getBoundsInParent().getMaxX() < 4768))  {
                if(warrior.getBoundsInParent().getMaxY() > 224) {
                    hero.warrior_jump_down(warrior);
                    if (warrior.getBoundsInParent().getMaxY() > 400) {
                        falling.setVisible(true);
                        if (hero.getAlive()) {
                            b1.setVisible(true);
                            b1.setDisable(false);
                        }
                        exit.setVisible(true);
                        exit.setDisable(false);
                    }
                }
            }
            if((warrior.getBoundsInParent().getMinX() > 4912 )&&(warrior.getBoundsInParent().getMaxX() < 4926))  {
                if(warrior.getBoundsInParent().getMaxY() > 224) {
                    hero.warrior_jump_down(warrior);
                    if (warrior.getBoundsInParent().getMaxY() > 400) {
                        falling.setVisible(true);
                        if (hero.getAlive()) {
                            b1.setVisible(true);
                            b1.setDisable(false);
                        }
                        exit.setVisible(true);
                        exit.setDisable(false);
                    }
                }
            }

        }
    };


    public void rotate_image(ImageView im){
        RotateTransition rotate = new RotateTransition();
        rotate.setNode(im);
        rotate.setByAngle(360);
        rotate.setCycleCount(TranslateTransition.INDEFINITE);
        rotate.setDuration(Duration.millis(1000));
        rotate.play();
    }

    public void move_sword(ImageView im, Orc gr){
        RotateTransition rotate = new RotateTransition();
        rotate.setNode(sword);
        rotate.setByAngle(360);
        rotate.setCycleCount(3);
        rotate.setDuration(Duration.millis(400));
        rotate.play();
        if (sword.getBoundsInParent().intersects(im.getBoundsInParent())){
            im.setImage(null);
        }
    }

    public void move_axe(){
        TranslateTransition jump = new TranslateTransition();
        jump.setNode(axe);
        jump.setDuration(Duration.millis(500));
        jump.setInterpolator(Interpolator.EASE_OUT);
        jump.setCycleCount(TranslateTransition.INDEFINITE);
        jump.setByY(120);
        jump.setByX(60);
        jump.setAutoReverse(true);
        jump.play();
        if (axe.getBoundsInParent().intersects(king_orc.getBoundsInParent())){
            bo.setPower(bo.getPower() - 25);
            if(bo.getPower() <=0){
                king_orc.setImage(null);
            }
        }
//        jump.play();
    }


    public void rotate_axe(){
        RotateTransition rotate = new RotateTransition();
        rotate.setNode(axe);
        rotate.setByAngle(270);
        rotate.setDuration(Duration.millis(500));
        rotate.setCycleCount(TranslateTransition.INDEFINITE);
        rotate.setAutoReverse(true);
        rotate.play();
    }


    @FXML
    private void pause(ActionEvent we) throws IOException {
        someGame.setY(warrior.getLayoutY());
        someGame.setX(warrior.getLayoutX());
        someGame.setScore(game_score);
        someGame.setCoins(game_coins);
        someGame.setX_back(back_components.getLayoutX());
        someGame.setW_status(hero.getW_status());
        someGame.setSword_x(sword.getLayoutX());
        someGame.setAxe_x(axe.getLayoutX());
        Parent root = FXMLLoader.load(getClass().getResource("pause_scene.fxml"));
        primaryStage = (Stage)((Node)we.getSource()).getScene().getWindow();
        Scene sc = new Scene(root);
        primaryStage.setScene(sc);
        primaryStage.show();
    }


    public void collisiontry(ImageView im1, ImageView im2, Orc gr) throws InterruptedException, IOException {
        double w_miny = im1.getBoundsInParent().getMinY();
        double o_maxy = im2.getBoundsInParent().getMaxY();
        double w_minx = im1.getBoundsInParent().getMinX();
        double w_maxx = im1.getBoundsInParent().getMaxX();
        double o_minx = im2.getBoundsInParent().getMinX();
        double o_maxx = im2.getBoundsInParent().getMaxX();


        if (im2.getImage() != null) {
            if ((w_miny > o_maxy) && (((w_minx > o_minx) && (w_minx < o_maxx)) || ((w_maxx > o_minx) && (w_maxx < o_maxx)))) {

                im1.setImage(null);
                BCR.setLayoutX(BCR.getLayoutX() - 40);
                BCR.setVisible(true);
                if (hero.getAlive()) {
                    b1.setVisible(true);
                    b1.setDisable(false);
                }
                exit.setVisible(true);
                exit.setDisable(false);
                burried.setVisible(true);

            }
            else if (im1.getBoundsInParent().intersects(im2.getBoundsInParent())) {
                TranslateTransition jump2 = new TranslateTransition();
                if (hero.getW_status() == 0) {
                    jump2.setNode(im2);
                    jump2.setDuration(Duration.millis(10));
                    jump2.setInterpolator(Interpolator.LINEAR);
                    im2.setLayoutX(im2.getLayoutX() + 60);

                }
                else if (hero.getW_status() == 1) {
                    move_sword(im2, gr);
                    if(im2.getImage() != null) {
                        jump2.setNode(im2);
                        jump2.setDuration(Duration.millis(10));
                        jump2.setInterpolator(Interpolator.LINEAR);
                        im2.setLayoutX(im2.getLayoutX() + 60);
                        gr.setPower(gr.getPower() - 25);
                        if(gr.getPower() <= 0){
                            im2.setImage(null);
                        }
                    }
                }
                else if (hero.getW_status() == 2) {
                    if(im2.getImage() != null) {
                        if(axe.getBoundsInParent().getMaxX() >= im2.getBoundsInParent().getMinX()){
                            gr.setPower(gr.getPower() - 25);
                            if (gr.getPower() <=0){
                                im2.setImage(null);
                            }
                        }
                        jump2.setNode(im2);
                        jump2.setDuration(Duration.millis(10));
                        jump2.setInterpolator(Interpolator.LINEAR);
                        im2.setLayoutX(im2.getLayoutX() + 60);
                    }

                }

                if ((im2.getBoundsInParent().getMinX() > 666) && (im2.getBoundsInParent().getMaxX() < 740)) {
                    if (im2.getBoundsInParent().getMaxY() > 140) {
                        gr.orc_jump_down(im2);
                        if (im2.getBoundsInParent().getMaxY() > 140) {
                            new java.util.Timer().schedule(
                                    new java.util.TimerTask() {
                                        @Override
                                        public void run() {
                                            im2.setImage(null);
                                        }
                                    },
                                    500
                            );
                        }
                    }
                }
                if ((im2.getBoundsInParent().getMinX() > 916) && (im2.getBoundsInParent().getMaxX() < 981)) {
                    if (im2.getBoundsInParent().getMaxY() > 140) {
                        gr.orc_jump_down(im2);
                        if (im2.getBoundsInParent().getMaxY() > 140) {
                            new java.util.Timer().schedule(
                                    new java.util.TimerTask() {
                                        @Override
                                        public void run() {
                                            im2.setImage(null);
                                        }
                                    },
                                    500
                            );
                        }
                    }
                }
                if ((im2.getBoundsInParent().getMaxX() > 1300) && (im2.getBoundsInParent().getMinX() < 1333)) {
                    if (im2.getBoundsInParent().getMaxY() > 140) {
                        gr.orc_jump_down(im2);
                        if (im2.getBoundsInParent().getMaxY() > 140) {
                            new java.util.Timer().schedule(
                                    new java.util.TimerTask() {
                                        @Override
                                        public void run() {
                                            im2.setImage(null);
                                        }
                                    },
                                    500
                            );
                        }
                    }
                }
                if ((im2.getBoundsInParent().getMinX() > 1834) && (im2.getBoundsInParent().getMaxX() < 1840)) {
                    if (im2.getBoundsInParent().getMaxY() > 140) {
                        gr.orc_jump_down(im2);
                        if (im2.getBoundsInParent().getMaxY() > 140) {
                            new java.util.Timer().schedule(
                                    new java.util.TimerTask() {
                                        @Override
                                        public void run() {
                                            im2.setImage(null);
                                        }
                                    },
                                    500
                            );
                        }
                    }
                }
                if ((im2.getBoundsInParent().getMaxX() > 1940) && (im2.getBoundsInParent().getMinX() < 1972)) {
                    if (im2.getBoundsInParent().getMaxY() > 140) {
                        gr.orc_jump_down(im2);
                        if (im2.getBoundsInParent().getMaxY() > 140) {
                            new java.util.Timer().schedule(
                                    new java.util.TimerTask() {
                                        @Override
                                        public void run() {
                                            im2.setImage(null);
                                        }
                                    },
                                    500
                            );
                        }
                    }
                }
                if ((im2.getBoundsInParent().getMinX() > 2132) && (im2.getBoundsInParent().getMaxX() < 2171)) {
                    if (im2.getBoundsInParent().getMaxY() > 140) {
                        gr.orc_jump_down(im2);
                        if (im2.getBoundsInParent().getMaxY() > 140) {
                            new java.util.Timer().schedule(
                                    new java.util.TimerTask() {
                                        @Override
                                        public void run() {
                                            im2.setImage(null);
                                        }
                                    },
                                    500
                            );
                        }
                    }
                }
                if ((im2.getBoundsInParent().getMinX() > 2286) && (im2.getBoundsInParent().getMaxX() < 2325)) {
                    if (im2.getBoundsInParent().getMaxY() > 140) {
                        gr.orc_jump_down(im2);
                        if (im2.getBoundsInParent().getMaxY() > 140) {
                            new java.util.Timer().schedule(
                                    new java.util.TimerTask() {
                                        @Override
                                        public void run() {
                                            im2.setImage(null);
                                        }
                                    },
                                    500
                            );
                        }
                    }
                }
                if ((im2.getBoundsInParent().getMinX() > 2579) && (im2.getBoundsInParent().getMaxX() < 2608)) {
                    if (im2.getBoundsInParent().getMaxY() > 140) {
                        gr.orc_jump_down(im2);
                        if (im2.getBoundsInParent().getMaxY() > 140) {
                            new java.util.Timer().schedule(
                                    new java.util.TimerTask() {
                                        @Override
                                        public void run() {
                                            im2.setImage(null);
                                        }
                                    },
                                    500
                            );
                        }
                    }
                }
                if ((im2.getBoundsInParent().getMaxX() > 3050) && (im2.getBoundsInParent().getMinX() < 3084)) {
                    if (im2.getBoundsInParent().getMaxY() > 140) {
                        gr.orc_jump_down(im2);
                        if (im2.getBoundsInParent().getMaxY() > 140) {
                            new java.util.Timer().schedule(
                                    new java.util.TimerTask() {
                                        @Override
                                        public void run() {
                                            im2.setImage(null);
                                        }
                                    },
                                    500
                            );
                        }
                    }
                }
                if ((im2.getBoundsInParent().getMaxX() > 3290) && (im2.getBoundsInParent().getMinX() < 3315)) {
                    if (im2.getBoundsInParent().getMaxY() > 140) {
                        gr.orc_jump_down(im2);
                        if (im2.getBoundsInParent().getMaxY() > 140) {
                            new java.util.Timer().schedule(
                                    new java.util.TimerTask() {
                                        @Override
                                        public void run() {
                                            im2.setImage(null);
                                        }
                                    },
                                    500
                            );
                        }
                    }
                }
                if ((im2.getBoundsInParent().getMaxX() > 3489) && (im2.getBoundsInParent().getMinX() < 3542)) {
                    if (im2.getBoundsInParent().getMaxY() > 140) {
                        gr.orc_jump_down(im2);
                        if (im2.getBoundsInParent().getMaxY() > 140) {
                            new java.util.Timer().schedule(
                                    new java.util.TimerTask() {
                                        @Override
                                        public void run() {
                                            im2.setImage(null);
                                        }
                                    },
                                    500
                            );
                        }
                    }
                }
                if ((im2.getBoundsInParent().getMaxX() > 3692) && (im2.getBoundsInParent().getMinX() < 3720)) {
                    if (im2.getBoundsInParent().getMaxY() > 140) {
                        gr.orc_jump_down(im2);
                        if (im2.getBoundsInParent().getMaxY() > 140) {
                            new java.util.Timer().schedule(
                                    new java.util.TimerTask() {
                                        @Override
                                        public void run() {
                                            im2.setImage(null);
                                        }
                                    },
                                    500
                            );
                        }
                    }
                }
                if ((im2.getBoundsInParent().getMaxX() > 3890) && (im2.getBoundsInParent().getMinX() < 3905)) {
                    if (im2.getBoundsInParent().getMaxY() > 140) {
                        gr.orc_jump_down(im2);
                        if (im2.getBoundsInParent().getMaxY() > 140) {
                            new java.util.Timer().schedule(
                                    new java.util.TimerTask() {
                                        @Override
                                        public void run() {
                                            im2.setImage(null);
                                        }
                                    },
                                    500
                            );
                        }
                    }
                }
                if ((im2.getBoundsInParent().getMaxX() > 4005) && (im2.getBoundsInParent().getMinX() < 4007)) {
                    if (im2.getBoundsInParent().getMaxY() > 140) {
                        gr.orc_jump_down(im2);
                        if (im2.getBoundsInParent().getMaxY() > 140) {
                            new java.util.Timer().schedule(
                                    new java.util.TimerTask() {
                                        @Override
                                        public void run() {
                                            im2.setImage(null);
                                        }
                                    },
                                    500
                            );
                        }
                    }
                }
                if ((im2.getBoundsInParent().getMaxX() > 4405) && (im2.getBoundsInParent().getMinX() < 4443)) {
                    if (im2.getBoundsInParent().getMaxY() > 140) {
                        gr.orc_jump_down(im2);
                        if (im2.getBoundsInParent().getMaxY() > 140) {
                            new java.util.Timer().schedule(
                                    new java.util.TimerTask() {
                                        @Override
                                        public void run() {
                                            im2.setImage(null);
                                        }
                                    },
                                    500
                            );
                        }
                    }
                }
                if ((im2.getBoundsInParent().getMinX() > 4560) && (im2.getBoundsInParent().getMinX() < 4579)) {
                    if (im2.getBoundsInParent().getMaxY() > 140) {
                        gr.orc_jump_down(im2);
                        if (im2.getBoundsInParent().getMaxY() > 140) {
                            new java.util.Timer().schedule(
                                    new java.util.TimerTask() {
                                        @Override
                                        public void run() {
                                            im2.setImage(null);
                                        }
                                    },
                                    500
                            );
                        }
                    }
                }
                if ((im2.getBoundsInParent().getMaxX() > 4760) && (im2.getBoundsInParent().getMinX() < 4768)) {
                    if (im2.getBoundsInParent().getMaxY() > 140) {
                        gr.orc_jump_down(im2);
                        if (im2.getBoundsInParent().getMaxY() > 140) {
                            new java.util.Timer().schedule(
                                    new java.util.TimerTask() {
                                        @Override
                                        public void run() {
                                            im2.setImage(null);
                                        }
                                    },
                                    500
                            );
                        }
                    }
                }
                if ((im2.getBoundsInParent().getMaxX() > 4912) && (im2.getBoundsInParent().getMinX() < 4926)) {
                    if (im2.getBoundsInParent().getMaxY() > 140) {
                        gr.orc_jump_down(im2);
                        if (im2.getBoundsInParent().getMaxY() > 140) {
                            new java.util.Timer().schedule(
                                    new java.util.TimerTask() {
                                        @Override
                                        public void run() {
                                            im2.setImage(null);
                                        }
                                    },
                                    500
                            );
                        }
                    }
                }
                jump2.play();
            }
        }
    }

    public void checkthis(ActionEvent e1) throws IOException, ClassNotFoundException{
        if((hero.getAlive())&&(game_coins >=5)) {
            someGame.setNot_saved(false);
            Saving_class try_obj = new Saving_class();
            try_obj.coins = game_coins;
            try_obj.score = game_score;
            try_obj.x_coordinate = warrior.getLayoutX();
            try_obj.stage = primaryStage;
            FileOutputStream fileout = new FileOutputStream("saved.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileout);
            out.writeObject(try_obj);
            out.close();
            fileout.close();
            Saving_class get_it = null;
            FileInputStream filein = new FileInputStream("C:\\Users\\shiva\\IdeaProjects\\new\\saved.ser");
            ObjectInputStream in = new ObjectInputStream(filein);
            get_it = (Saving_class) in.readObject();
            in.close();
            filein.close();
            hero.setCoins(hero.getCoins() - 5);
            someGame.setX(someGame.getX() - 48);
            someGame.setX_back(someGame.getX_back() + 48);
            someGame.setCoins(someGame.getW().getCoins() - 5);
            Controller.game_coins = someGame.getW().getCoins();
            Controller.game_score = someGame.getW().getScore();
            Controller.x_co = someGame.getX();
            Controller.x_back = someGame.getX_back();
            b1.setVisible(false);
            b1.setDisable(true);
            hero.setAlive(false);
            Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
            primaryStage = (Stage) ((Node) e1.getSource()).getScene().getWindow();
            Scene sc = new Scene(root);
            primaryStage.setScene(sc);
            primaryStage.show();
        }
        else{
            System.out.println("You cannot be saved");
        }
    }

    public void exit(ActionEvent e1) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("menu.fxml"));
        primaryStage = (Stage)((Node)e1.getSource()).getScene().getWindow();
        Scene sc = new Scene(root);
        primaryStage.setScene(sc);
        primaryStage.show();

    }

    public void collision_chest(ImageView im1, ImageView im2, Chest c) throws InterruptedException {
        if(im1.getBoundsInParent().intersects(im2.getBoundsInParent())){
            im2.setImage(c.getIm1());
            im2.setScaleX(2);
            im2.setScaleY(2);
            im2.setLayoutY(178);
            if (c.getUsed() == false){
                if (c.getType() == 0){
                    game_coins = game_coins + 5;
                    coin.setText("Coins : "+game_coins);
                    someGame.setCoins(game_coins);
                }
                else if(c.getType() == 1){

                    sword.setVisible(true);
                    hero.setW_status(1);
                    someGame.setW_status(1);


                }
                else if(c.getType() == 2){
                    sword.setVisible(false);
                    sword.setImage(null);
                    axe.setVisible(true);
                    hero.setW_status(2);
                    someGame.setW_status(2);
                    Weapon w2 = new Axe(25,2);
                }
                c.setUsed();
            }


        }
    }

    public void collision_tnt(ImageView im1, ImageView im2){
        if(im1.getBoundsInParent().intersects(im2.getBoundsInParent())){

            final boolean[] condition = {false};
            new java.util.Timer().schedule(
                    new java.util.TimerTask(){
                        @Override
                        public void run(){
                            Image burst = new Image("burst2.png");
                            im2.setScaleX(3);
                            im2.setScaleY(3);
                            im2.setImage(burst);
                            // your code here
                            if(im1.getBoundsInParent().intersects(im2.getBoundsInParent())){
                                condition[0] =true;
                            }
                            if(condition[0]){
                                im1.setImage(null);
                                blasted.setVisible(true);
                                if (hero.getAlive()) {
                                    b1.setVisible(true);
                                    b1.setDisable(false);
                                }
                                exit.setVisible(true);
                                exit.setDisable(false);

                            }
                        }

                    },
                    500
            );
        }
    }

    public void collision_coin(ImageView im1, ImageView im2){
        if(im1.getBoundsInParent().intersects(im2.getBoundsInParent())){
            if (im2.getImage()!=null) {
                game_coins++;
                hero.setCoins(game_coins);
                someGame.setCoins(game_coins);

                String x = Integer.toString(game_coins);
                coin.setText("Coins : " + x);
            }
            im2.setImage(null);
        }
    }

    public void warrior_move_forward(MouseEvent mouseEvent){
        if ((warrior.getImage() != null)&&(BCR.getImage()!=null)){

            game_score++;
            someGame.setScore(game_score);
            hero.setScore(game_score);
            String x = Integer.toString(game_score);
            score.setText("Score : " + x);
            TranslateTransition jump = new TranslateTransition();
            jump.setNode(warrior);
            jump.setDuration(Duration.millis(10));
            jump.setInterpolator(Interpolator.LINEAR);
            warrior.setLayoutX(warrior.getLayoutX() + 48);
            someGame.setX(warrior.getLayoutX());

            BCR.setLayoutX(BCR.getLayoutX() + 48);
            sword.setLayoutX(sword.getLayoutX() + 48);
            axe.setLayoutX(axe.getLayoutX() + 48);
            someGame.setSword_x(sword.getLayoutX());
            someGame.setAxe_x(axe.getLayoutX());
            jump.play();
            if (warrior.getBoundsInParent().getMaxX() >= 5625){
                Image some = new Image("winning.gif");
                burried.setImage(some);
                burried.setVisible(true);
                score.setLayoutX(210);
                score.setLayoutY(155);
                score.setText("" + (game_score-1));
                score.setTextFill(Color.web("#ffffff"));
                score.setFont(new Font("Times New Roman",20));
                score.setFont(Font.font("Times New Roman",FontWeight.BOLD, 22));
                coin.setLayoutX(430);
                coin.setLayoutY(155);
                coin.setText("" + game_coins);
                coin.setTextFill(Color.web("#ffffff"));
                coin.setFont(new Font("Times New Roman", 20));
                coin.setFont(Font.font("Times New Roman",FontWeight.BOLD, 22));
                exit.setVisible(true);
                exit.setLayoutX(exit.getLayoutX() + 50);
                warrior.setImage(null);

//                something.setLayoutX(0);
//                something.setLayoutY(0);
//                something.setFitWidth(560);
//                something.setFitHeight(300);
            }
        }
    }

    public void scene_move_back(MouseEvent mouseEvent) {
        if (warrior.getImage() != null) {
            TranslateTransition jump = new TranslateTransition();
            jump.setNode(back_components);
            jump.setDuration(Duration.millis(1340));
            jump.setInterpolator(Interpolator.LINEAR);
            back_components.setLayoutX(back_components.getLayoutX()-48);
            someGame.setX_back(back_components.getLayoutX());
            jump.play();

        }
    }
}