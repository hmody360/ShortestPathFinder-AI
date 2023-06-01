/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package aimapsproject;

import java.awt.Insets;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.css.converter.StringConverter;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.image.*;
import javafx.scene.control.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

/**
 *
 * @author Owner
 */
//Main Class
public class AIMapsProject extends Application {
//Method invoked in main to start the program(used in JavaFX programs)

    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        //Take image from pc and use it as the Map image then inserting it into an imageView(PLEASE CHANGE PATH BELOW TO THE PICTURE INCLUDED WITH THE PROGRAM AFTER DOWNLOAD)
        FileInputStream inputstream = new FileInputStream("C:\\Users\\Owner\\Documents\\NetBeansProjects\\AIMapsProject\\src\\aimapsproject\\Pic_MapOfAwali.jpeg");
        Image image = new Image(inputstream);
        ImageView imageView = new ImageView(image);
        imageView.setX(0);
        imageView.setY(0);
        imageView.setTranslateZ(-1);
        //Label including our names to display within the program
        Label ourNames = new Label("Participating Students     |     SID       |Group Number|           Email Address          |\n"
                + "Mohammed Sami Soqati |441010207|          1            |s441010207@st.uqu.edu.sa|\n"
                + "Omar Amjad Abouellil     |441018030|          1            |s441018030@st.uqu.edu.sa|\n"
                + "===================================================\n");
        ourNames.setTranslateX(10);
        ourNames.setTranslateY(10);
        ourNames.setStyle("-fx-border-style:solid");
        //Label that will include the path from start to end goal and will appear when clicking Start Button
        Label finalResult = new Label("");
        finalResult.setTranslateX(516);
        finalResult.setTranslateY(500);

        //Button to reset the program after each operation
        Button ResetBtn = new Button("Reset");
        ResetBtn.setTranslateX(1150);
        ResetBtn.setTranslateY(500);
        //Button to start finding the best path between start and goal nodes
        Button StartBtn = new Button("Start");
        StartBtn.setTranslateX(1200);
        StartBtn.setTranslateY(500);
        //Creation of all Nodes within the Map including each node's id,point and point's default color
        MNode n1 = new MNode(1, new Circle(18.666666666666668, 250.66666666666666, 7, Color.RED));
        MNode n2 = new MNode(2, new Circle(24.666666666666668, 302.0, 7, Color.RED));
        MNode n3 = new MNode(3, new Circle(38.0, 354.0, 7, Color.RED));
        MNode n4 = new MNode(4, new Circle(56.666666666666664, 405.3333333333333, 7, Color.RED));
        MNode n5 = new MNode(5, new Circle(76.0, 450.0, 7, Color.RED));
        MNode n6 = new MNode(6, new Circle(120.66666666666667, 488.6666666666667, 7, Color.RED));
        MNode n7 = new MNode(7, new Circle(154.0, 514.0, 7, Color.RED));
        MNode n8 = new MNode(8, new Circle(244.0, 559.3333333333334, 7, Color.RED));
        MNode n9 = new MNode(9, new Circle(270.0, 488.0, 7, Color.RED));
        MNode n10 = new MNode(10, new Circle(224.66666666666666, 462.6666666666667, 7, Color.RED));
        MNode n11 = new MNode(11, new Circle(211.33333333333334, 500.6666666666667, 7, Color.RED));
        MNode n12 = new MNode(12, new Circle(179.33333333333334, 475.3333333333333, 7, Color.RED));
        MNode n13 = new MNode(13, new Circle(289.3333333333333, 430.6666666666667, 7, Color.RED));
        MNode n14 = new MNode(14, new Circle(244.0, 411.3333333333333, 7, Color.RED));
        MNode n15 = new MNode(15, new Circle(218.66666666666666, 398.6666666666667, 7, Color.RED));
        MNode n16 = new MNode(16, new Circle(198.66666666666666, 379.3333333333333, 7, Color.RED));
        MNode n17 = new MNode(17, new Circle(173.33333333333334, 366.0, 7, Color.RED));
        MNode n18 = new MNode(18, new Circle(166.66666666666666, 340.0, 7, Color.RED));
        MNode n19 = new MNode(19, new Circle(154.0, 314.6666666666667, 7, Color.RED));
        MNode n20 = new MNode(20, new Circle(102.66666666666667, 436.6666666666667, 7, Color.RED));
        MNode n21 = new MNode(21, new Circle(82.66666666666667, 391.3333333333333, 7, Color.RED));
        MNode n22 = new MNode(22, new Circle(63.333333333333336, 340.0, 7, Color.RED));
        MNode n23 = new MNode(23, new Circle(154.0, 276.0, 7, Color.RED));
        MNode n24 = new MNode(24, new Circle(186.0, 219.33333333333334, 7, Color.RED));
        MNode n25 = new MNode(25, new Circle(192.66666666666666, 269.3333333333333, 7, Color.RED));
        MNode n26 = new MNode(26, new Circle(218.0, 333.3333333333333, 7, Color.RED));
        MNode n27 = new MNode(27, new Circle(250.66666666666666, 314.6666666666667, 7, Color.RED));
        MNode n28 = new MNode(28, new Circle(321.3333333333333, 301.3333333333333, 7, Color.RED));
        MNode n29 = new MNode(29, new Circle(360.6666666666667, 365.3333333333333, 7, Color.RED));
        MNode n30 = new MNode(30, new Circle(386.0, 410.6666666666667, 7, Color.RED));
        MNode n31 = new MNode(31, new Circle(354.0, 455.3333333333333, 7, Color.RED));
        MNode n32 = new MNode(32, new Circle(470.0, 455.3333333333333, 7, Color.RED));
        MNode n33 = new MNode(33, new Circle(334.0, 488.0, 7, Color.RED));
        MNode n34 = new MNode(34, new Circle(475.3333333333333, 487.3333333333333, 7, Color.RED));
        MNode n35 = new MNode(35, new Circle(328.0, 520.6666666666666, 7, Color.RED));
        MNode n36 = new MNode(36, new Circle(477.3333333333333, 526.6666666666666, 7, Color.RED));
        MNode n37 = new MNode(37, new Circle(463.3333333333333, 404.6666666666667, 7, Color.RED));
        MNode n38 = new MNode(38, new Circle(450.6666666666667, 372.0, 7, Color.RED));
        MNode n39 = new MNode(39, new Circle(508.6666666666667, 359.3333333333333, 7, Color.RED));
        MNode n40 = new MNode(40, new Circle(515.3333333333334, 390.6666666666667, 7, Color.RED));
        MNode n41 = new MNode(41, new Circle(444.0, 346.0, 7, Color.RED));
        MNode n42 = new MNode(42, new Circle(437.3333333333333, 313.3333333333333, 7, Color.RED));
        MNode n43 = new MNode(43, new Circle(431.3333333333333, 282.6666666666667, 7, Color.RED));
        MNode n44 = new MNode(44, new Circle(354.0, 242.66666666666666, 7, Color.RED));
        MNode n45 = new MNode(45, new Circle(347.3333333333333, 191.33333333333334, 7, Color.RED));
        MNode n46 = new MNode(46, new Circle(424.6666666666667, 178.66666666666666, 7, Color.RED));
        MNode n47 = new MNode(47, new Circle(438.0, 224.0, 7, Color.RED));
        MNode n48 = new MNode(48, new Circle(463.3333333333333, 165.33333333333334, 7, Color.RED));
        MNode n49 = new MNode(49, new Circle(476.6666666666667, 217.33333333333334, 7, Color.RED));
        MNode n50 = new MNode(50, new Circle(496.0, 275.3333333333333, 7, Color.RED));
        MNode n51 = new MNode(51, new Circle(579.3333333333334, 146.66666666666666, 7, Color.RED));
        MNode n52 = new MNode(52, new Circle(586.0, 198.0, 7, Color.RED));
        MNode n53 = new MNode(53, new Circle(580.0, 256.0, 7, Color.RED));
        MNode n54 = new MNode(54, new Circle(592.0, 346.0, 7, Color.RED));
        MNode n55 = new MNode(55, new Circle(592.6666666666666, 378.0, 7, Color.RED));
        MNode n56 = new MNode(56, new Circle(644.0, 371.3333333333333, 7, Color.RED));
        MNode n57 = new MNode(57, new Circle(650.6666666666666, 417.3333333333333, 7, Color.RED));
        MNode n58 = new MNode(58, new Circle(656.6666666666666, 468.6666666666667, 7, Color.RED));
        MNode n59 = new MNode(59, new Circle(708.0, 468.0, 7, Color.RED));
        MNode n60 = new MNode(60, new Circle(721.3333333333334, 430.0, 7, Color.RED));
        MNode n61 = new MNode(61, new Circle(682.6666666666666, 371.3333333333333, 7, Color.RED));
        MNode n62 = new MNode(62, new Circle(682.6666666666666, 332.6666666666667, 7, Color.RED));
        MNode n63 = new MNode(63, new Circle(644.0, 314.0, 7, Color.RED));
        MNode n64 = new MNode(64, new Circle(644.0, 282.0, 7, Color.RED));
        MNode n65 = new MNode(65, new Circle(644.0, 243.33333333333334, 7, Color.RED));
        MNode n66 = new MNode(66, new Circle(709.3333333333334, 178.66666666666666, 7, Color.RED));
        MNode n67 = new MNode(67, new Circle(702.0, 120.66666666666667, 7, Color.RED));
        MNode n68 = new MNode(68, new Circle(863.3333333333334, 95.33333333333333, 7, Color.RED));
        MNode n69 = new MNode(69, new Circle(870.0, 146.0, 7, Color.RED));
        MNode n70 = new MNode(70, new Circle(753.3333333333334, 223.33333333333334, 7, Color.RED));
        MNode n71 = new MNode(71, new Circle(747.3333333333334, 262.0, 7, Color.RED));
        MNode n72 = new MNode(72, new Circle(766.6666666666666, 294.6666666666667, 7, Color.RED));
        MNode n73 = new MNode(73, new Circle(773.3333333333334, 359.3333333333333, 7, Color.RED));
        MNode n74 = new MNode(74, new Circle(792.6666666666666, 404.6666666666667, 7, Color.RED));
        MNode n75 = new MNode(75, new Circle(779.3333333333334, 456.0, 7, Color.RED));
        MNode n76 = new MNode(76, new Circle(824.0, 423.3333333333333, 7, Color.RED));
        MNode n77 = new MNode(77, new Circle(805.3333333333334, 372.0, 7, Color.RED));
        MNode n78 = new MNode(78, new Circle(837.3333333333334, 384.6666666666667, 7, Color.RED));
        MNode n79 = new MNode(79, new Circle(818.6666666666666, 249.33333333333334, 7, Color.RED));
        MNode n80 = new MNode(80, new Circle(812.0, 210.66666666666666, 7, Color.RED));
        MNode n81 = new MNode(81, new Circle(844.0, 204.0, 7, Color.RED));
        MNode n82 = new MNode(82, new Circle(876.6666666666666, 198.66666666666666, 7, Color.RED));
        MNode n83 = new MNode(83, new Circle(882.6666666666666, 262.0, 7, Color.RED));
        MNode n84 = new MNode(84, new Circle(979.3333333333334, 242.0, 7, Color.RED));
        MNode n85 = new MNode(85, new Circle(973.3333333333334, 184.66666666666666, 7, Color.RED));
        MNode n86 = new MNode(86, new Circle(966.6666666666666, 127.33333333333333, 7, Color.RED));
        MNode n87 = new MNode(87, new Circle(1024.6666666666667, 62.666666666666664, 7, Color.RED));
        MNode n88 = new MNode(88, new Circle(1147.3333333333333, 101.33333333333333, 7, Color.RED));
        MNode n89 = new MNode(89, new Circle(1263.3333333333333, 127.33333333333333, 7, Color.RED));
        MNode n90 = new MNode(90, new Circle(1244.0, 178.66666666666666, 7, Color.RED));
        MNode n91 = new MNode(91, new Circle(1238.0, 236.0, 7, Color.RED));
        MNode n92 = new MNode(92, new Circle(1231.3333333333333, 298.0, 7, Color.RED));
        MNode n93 = new MNode(93, new Circle(1224.6666666666667, 358.6666666666667, 7, Color.RED));
        MNode n94 = new MNode(94, new Circle(986.0, 306.0, 7, Color.RED));
        MNode n95 = new MNode(95, new Circle(952.6666666666666, 453.3333333333333, 7, Color.RED));
        //--------------------------------------------------
        //Assiging each node it's children(Neighboring Nodes)
        n1.children.add(n2);
        n1.children.add(n24);
        //-------------------
        n2.children.add(n1);
        n2.children.add(n3);
        n2.children.add(n23);
        //-------------------
        n3.children.add(n2);
        n3.children.add(n4);
        n3.children.add(n22);
        //-------------------
        n4.children.add(n3);
        n4.children.add(n5);
        n4.children.add(n21);
        //-------------------
        n5.children.add(n4);
        n5.children.add(n6);
        n5.children.add(n20);
        //-------------------
        n6.children.add(n5);
        n6.children.add(n7);
        n6.children.add(n16);
        //-------------------
        n7.children.add(n6);
        n7.children.add(n8);
        n7.children.add(n12);
        //-------------------
        n8.children.add(n7);
        n8.children.add(n9);
        //-------------------
        n9.children.add(n8);
        n9.children.add(n10);
        n9.children.add(n13);
        //-------------------
        n10.children.add(n9);
        n10.children.add(n11);
        n10.children.add(n14);
        //-------------------
        n11.children.add(n10);
        n11.children.add(n12);
        //-------------------
        n12.children.add(n7);
        n12.children.add(n11);
        n12.children.add(n15);
        //-------------------
        n13.children.add(n9);
        n13.children.add(n14);
        n13.children.add(n31);
        //-------------------
        n14.children.add(n10);
        n14.children.add(n13);
        n14.children.add(n15);
        //-------------------
        n15.children.add(n12);
        n15.children.add(n14);
        n15.children.add(n16);
        //-------------------
        n16.children.add(n6);
        n16.children.add(n15);
        n16.children.add(n17);
        //-------------------
        n17.children.add(n16);
        n17.children.add(n18);
        n17.children.add(n20);
        //-------------------
        n18.children.add(n17);
        n18.children.add(n19);
        n18.children.add(n21);
        //-------------------
        n19.children.add(n18);
        n19.children.add(n22);
        //-------------------
        n20.children.add(n5);
        n20.children.add(n17);
        //-------------------
        n21.children.add(n4);
        n21.children.add(n18);
        //-------------------
        n22.children.add(n3);
        n22.children.add(n19);
        //-------------------
        n23.children.add(n2);
        n23.children.add(n25);
        //-------------------
        n24.children.add(n1);
        n24.children.add(n25);
        n24.children.add(n45);
        //-------------------
        n25.children.add(n23);
        n25.children.add(n24);
        n25.children.add(n44);
        //-------------------
        n26.children.add(n25);
        n26.children.add(n27);
        n26.children.add(n30);
        //-------------------
        n27.children.add(n26);
        n27.children.add(n28);
        n27.children.add(n29);
        //-------------------
        n28.children.add(n27);
        n28.children.add(n43);
        //-------------------
        n29.children.add(n27);
        n29.children.add(n38);
        n29.children.add(n41);
        //-------------------
        n30.children.add(n26);
        n30.children.add(n37);
        //-------------------
        n31.children.add(n13);
        n31.children.add(n32);
        n31.children.add(n33);
        //-------------------
        n32.children.add(n31);
        n32.children.add(n34);
        n32.children.add(n57);
        //-------------------
        n33.children.add(n31);
        n33.children.add(n34);
        n33.children.add(n35);
        //-------------------
        n34.children.add(n32);
        n34.children.add(n33);
        n34.children.add(n36);
        //-------------------
        n35.children.add(n33);
        n35.children.add(n36);
        //-------------------
        n36.children.add(n34);
        n36.children.add(n35);
        //-------------------
        n37.children.add(n30);
        n37.children.add(n40);
        //-------------------
        n38.children.add(n29);
        n38.children.add(n39);
        n38.children.add(n41);
        //-------------------
        n39.children.add(n38);
        n39.children.add(n50);
        //-------------------
        n40.children.add(n37);
        n40.children.add(n55);
        //-------------------
        n41.children.add(n29);
        n41.children.add(n38);
        n41.children.add(n42);
        //-------------------
        n42.children.add(n41);
        n42.children.add(n43);
        //-------------------
        n43.children.add(n28);
        n43.children.add(n42);
        n43.children.add(n50);
        //-------------------
        n44.children.add(n25);
        n44.children.add(n45);
        n44.children.add(n47);
        //-------------------
        n45.children.add(n24);
        n45.children.add(n44);
        n45.children.add(n46);
        //-------------------
        n46.children.add(n45);
        n46.children.add(n47);
        n46.children.add(n48);
        //-------------------
        n47.children.add(n44);
        n47.children.add(n46);
        n47.children.add(n49);
        //-------------------
        n48.children.add(n46);
        n48.children.add(n49);
        n48.children.add(n51);
        //-------------------
        n49.children.add(n47);
        n49.children.add(n48);
        n49.children.add(n52);
        //-------------------
        n50.children.add(n39);
        n50.children.add(n43);
        n50.children.add(n53);
        //-------------------
        n51.children.add(n48);
        n51.children.add(n52);
        n51.children.add(n67);
        //-------------------
        n52.children.add(n49);
        n52.children.add(n51);
        n52.children.add(n66);
        //-------------------
        n53.children.add(n50);
        n53.children.add(n54);
        n53.children.add(n65);
        //-------------------
        n54.children.add(n53);
        n54.children.add(n55);
        n54.children.add(n62);
        //-------------------
        n55.children.add(n40);
        n55.children.add(n54);
        n55.children.add(n56);
        //-------------------
        n56.children.add(n55);
        n56.children.add(n57);
        n56.children.add(n61);
        //-------------------
        n57.children.add(n32);
        n57.children.add(n56);
        n57.children.add(n58);
        n57.children.add(n60);
        //-------------------
        n58.children.add(n57);
        n58.children.add(n59);
        //-------------------
        n59.children.add(n58);
        n59.children.add(n60);
        //-------------------
        n60.children.add(n57);
        n60.children.add(n59);
        n60.children.add(n75);
        //-------------------
        n61.children.add(n56);
        n61.children.add(n74);
        //-------------------
        n62.children.add(n54);
        n62.children.add(n73);
        //-------------------
        n63.children.add(n64);
        n63.children.add(n72);
        //-------------------
        n64.children.add(n63);
        n64.children.add(n65);
        n64.children.add(n71);
        //-------------------
        n65.children.add(n53);
        n65.children.add(n64);
        n65.children.add(n70);
        //-------------------
        n66.children.add(n52);
        n66.children.add(n67);
        n66.children.add(n69);
        //-------------------
        n67.children.add(n51);
        n67.children.add(n66);
        n67.children.add(n68);
        //-------------------
        n68.children.add(n67);
        n68.children.add(n69);
        n68.children.add(n87);
        //-------------------
        n69.children.add(n66);
        n69.children.add(n68);
        n69.children.add(n82);
        n69.children.add(n86);
        //-------------------
        n70.children.add(n65);
        n70.children.add(n71);
        n70.children.add(n80);
        //-------------------
        n71.children.add(n64);
        n71.children.add(n70);
        n71.children.add(n79);
        //-------------------
        n72.children.add(n63);
        n72.children.add(n73);
        //-------------------
        n73.children.add(n62);
        n73.children.add(n72);
        n73.children.add(n77);
        n73.children.add(n79);
        //-------------------
        n74.children.add(n61);
        n74.children.add(n75);
        n74.children.add(n76);
        //-------------------
        n75.children.add(n60);
        n75.children.add(n74);
        //-------------------
        n76.children.add(n74);
        n76.children.add(n78);
        n76.children.add(n95);
        //-------------------
        n77.children.add(n73);
        n77.children.add(n78);
        n77.children.add(n81);
        //-------------------
        n78.children.add(n76);
        n78.children.add(n77);
        n78.children.add(n83);
        //-------------------
        n79.children.add(n71);
        n79.children.add(n73);
        n79.children.add(n80);
        //-------------------
        n80.children.add(n70);
        n80.children.add(n79);
        n80.children.add(n81);
        //-------------------
        n81.children.add(n77);
        n81.children.add(n80);
        n81.children.add(n82);
        //-------------------
        n82.children.add(n69);
        n82.children.add(n81);
        n82.children.add(n83);
        //-------------------
        n83.children.add(n78);
        n83.children.add(n82);
        n83.children.add(n84);
        //-------------------
        n84.children.add(n83);
        n84.children.add(n85);
        n84.children.add(n92);
        n84.children.add(n94);
        //-------------------
        n85.children.add(n84);
        n85.children.add(n86);
        n85.children.add(n91);
        //-------------------
        n86.children.add(n69);
        n86.children.add(n85);
        n86.children.add(n90);
        //-------------------
        n87.children.add(n68);
        n87.children.add(n88);
        //-------------------
        n88.children.add(n87);
        n88.children.add(n89);
        //-------------------
        n89.children.add(n88);
        n89.children.add(n90);
        //-------------------
        n90.children.add(n86);
        n90.children.add(n89);
        n90.children.add(n91);
        //-------------------
        n91.children.add(n85);
        n91.children.add(n90);
        n91.children.add(n92);
        //-------------------
        n92.children.add(n84);
        n92.children.add(n91);
        n92.children.add(n93);
        //-------------------
        n93.children.add(n92);
        n93.children.add(n94);
        //-------------------
        n94.children.add(n84);
        n94.children.add(n95);
        //-------------------
        n95.children.add(n76);
        n95.children.add(n94);

        //Creation of Observable list that will include all nodes to choose from as either start or goal node
        ObservableList<MNode> options
                = FXCollections.observableArrayList(
                        n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13, n14, n15, n16, n17, n18, n19, n20, n21, n22, n23, n24, n25, n26, n27, n28, n29, n30, n31, n32, n33, n34, n35, n36, n37, n38, n39, n40, n41, n42, n43, n44, n45, n46, n47, n48, n49, n50, n51, n52, n53, n54, n55, n56, n57, n58, n59, n60, n61, n62, n63, n64, n65, n66, n67, n68, n69, n70, n71, n72, n73, n74, n75, n76, n77, n78, n79, n80, n81, n82, n83, n84, n85, n86, n87, n88, n89, n90, n91, n92, n93, n94, n95
                );
        //ComboBox(Drobdown List) that will contain nodes to choose from as start node
        final ComboBox startPointList = new ComboBox(options);
        startPointList.setTranslateX(500);
        startPointList.setTranslateY(50);
        Label startPointLabel = new Label("Select Starting point");
        startPointLabel.setTranslateX(480);
        startPointLabel.setTranslateY(20);
        //ComboBox(Drobdown List) that will contain nodes to choose from as start node
        final ComboBox goalPointList = new ComboBox(options);
        goalPointList.setTranslateX(645);
        goalPointList.setTranslateY(50);
        Label goalPointLabel = new Label("Select Goal point");
        goalPointLabel.setTranslateX(630);
        goalPointLabel.setTranslateY(20);
        //The pane that will include the imageView, all buttons and comboBoxes and labels + ALL Nodes
        Group root = new Group(imageView, startPointLabel, startPointList, goalPointLabel, goalPointList, ourNames, finalResult, ResetBtn, StartBtn,
                 n1.point, n2.point, n3.point, n4.point, n5.point, n6.point, n7.point, n8.point, n9.point, n10.point,
                 n11.point, n12.point, n13.point, n14.point, n15.point, n16.point, n17.point, n18.point, n19.point, n20.point,
                 n21.point, n22.point, n23.point, n24.point, n25.point, n26.point, n27.point, n28.point, n29.point, n30.point,
                 n31.point, n32.point, n33.point, n34.point, n35.point, n36.point, n37.point, n38.point, n39.point, n40.point,
                 n41.point, n42.point, n43.point, n44.point, n45.point, n46.point, n47.point, n48.point, n49.point, n50.point,
                 n51.point, n52.point, n53.point, n54.point, n55.point, n56.point, n57.point, n58.point, n59.point, n60.point,
                 n61.point, n62.point, n63.point, n64.point, n65.point, n66.point, n67.point, n68.point, n69.point, n70.point,
                 n71.point, n72.point, n73.point, n74.point, n75.point, n76.point, n77.point, n78.point, n79.point, n80.point,
                 n81.point, n82.point, n83.point, n84.point, n85.point, n86.point, n87.point, n88.point, n89.point, n90.point,
                 n91.point, n92.point, n93.point, n94.point, n95.point);
        //----------------------------------------------------
        //Astar object that will enable us to accsess the visited list and the fringe 
        Astar star = new Astar();
//lambda expression that will reset all node's attributes(that were updated when running)and clear the fringe and visited from any values
        ResetBtn.setOnAction(mouseEvent -> {
            for (MNode n : options) {
                n.distanceFromGoal = 0.0;
                n.distanceFromParent = 0.0;
                n.point.setFill(Color.RED);
                n.path.clear();

            }
            star.visited.clear();
            star.Q.clear();
            finalResult.setText("");
            finalResult.setStyle("");

        });
//lambda expression that will run when clicking Start Button
        StartBtn.setOnAction(mouseEvent -> {
            //if user didn't choose either a start or goal node prompt them to choose
            if (startPointList.getValue() == null || goalPointList.getValue() == null) {
                finalResult.setText("Please input both start and goal node!!!");
            }
            //set up the start and goal nodes and inser start node into the fringe
            boolean running = true;
            MNode sNode = (MNode) startPointList.getValue();
            MNode gNode = (MNode) goalPointList.getValue();
            sNode.setDistanceFromGoal(star.getSLD(sNode, gNode));
            star.Q.add(sNode);
            sNode.path.add(sNode);
            //while loop that will run until reaching the goal node
            while (running) {
                MNode cNode = star.Q.remove();
                cNode.point.setFill(Color.YELLOW);
                System.out.println("Current Path");
                System.out.println("Current Node: n" + cNode.id);
                System.out.println("distance from parent: " + cNode.getDistanceFromParent());
                System.out.println("distance from goal: " + cNode.getDistanceFromGoal());
                System.out.println("Node's A* value: " + cNode.getF());
                //if goal node is found change the best path to green, print the result(in program) and exit while loop
                if (cNode.equals(gNode)) {
                    for (MNode n : cNode.path) {
                        n.point.setFill(Color.GREEN);
                    }
                    System.out.println(cNode.path.toString());
                    System.out.println("Reached goal Node!");
                    finalResult.setStyle("-fx-border-style:solid");
                    finalResult.setText("Path is: " + cNode.path.toString() + "\nReached goal Node!");
                    running = false;
                }
                //else get all children of the current node,calculate thier SLD from parent+SLD to goal ,add them to visited list and insert them one by one to the fringe 
                else {

                    for (MNode child : cNode.getChildren()) {
                        if (!star.visited.contains(child.id)) {
                            child.setDistanceFromParent(cNode.getDistanceFromParent() + star.getSLD(cNode, child));
                            child.setDistanceFromGoal(star.getSLD(child, gNode));
                            star.visited.add(child.id);
                            star.Q.add(child);
                            child.path.addAll(cNode.path);
                            child.path.add(child);

                        }

                    }

                }

            }
        });

        //This method was used during the creation of the program to get each node's coordaniets manually by clicking them on the screen
//        root.setOnMouseClicked(mouseEvent -> {
//            System.out.println(mouseEvent.getX() + "," + mouseEvent.getY());
//
//        });

        //creating the scene using the root and dimensions are specified to the map used in the program
        Scene scene = new Scene(root, 1280, 568);
        //Setting up program's title and scene then showing the stage
        primaryStage.setTitle("Map of Awali");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    //Main method
    public static void main(String[] args) {
        launch(args);
    }

}
