package com.gdrcn.util;

import com.gdrcn.listener.DragListener;
import javafx.scene.Node;
import javafx.stage.Stage;

/**
 * 工具类
 * @author Ning
 */
public class DragUtil {
    public static void addDragListener(Stage stage, Node root) {
        new DragListener(stage).enableDrag(root);
    }
}