package com.nokia.ros.nodeExecutor;

import java.net.URI;

import org.ros.node.DefaultNodeMainExecutor;
import org.ros.node.NodeConfiguration;
import org.ros.node.NodeMain;
import org.ros.node.NodeMainExecutor;

import com.google.common.base.Preconditions;
import com.nokia.ros.nodes.Motion;
import com.nokia.ros.nodes.Position;

public class NodeExecutor {

	public static void main(String[] args) {
		URI masterUri = URI.create("http://akashyap-HP-ProBook-640-G1:11311/");
		String host = "akashyap-HP-ProBook-640-G1";
		NodeMainExecutor executor = DefaultNodeMainExecutor.newDefault();
		NodeConfiguration nodeConfiguration = NodeConfiguration.newPublic(host, masterUri);
		Motion motionNode = new Motion("back", 2);
		Position positionNode = new Position();
		//move(motionNode, executor, nodeConfiguration);
		currentLocation(positionNode, executor, nodeConfiguration);
	}

	private static void currentLocation(NodeMain node, NodeMainExecutor executor, NodeConfiguration nodeConfiguration) {
		Preconditions.checkState(node != null);
		executor.execute(node, nodeConfiguration);
	}

	private static void move(NodeMain node, NodeMainExecutor executor, NodeConfiguration nodeConfiguration) {
		Preconditions.checkState(node != null);
		executor.execute(node, nodeConfiguration);

	}
}
