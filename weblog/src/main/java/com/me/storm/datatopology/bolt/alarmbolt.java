package com.me.storm.datatopology.bolt;

import java.util.Map;

import org.apache.storm.task.OutputCollector;
import org.apache.storm.task.TopologyContext;
import org.apache.storm.topology.OutputFieldsDeclarer;
import org.apache.storm.topology.base.BaseRichBolt;
import org.apache.storm.tuple.Tuple;

public class alarmbolt extends BaseRichBolt {

	@Override
	public void execute(Tuple arg0) {

	}

	@Override
	public void prepare(Map arg0, TopologyContext arg1, OutputCollector arg2) {

	}

	@Override
	public void declareOutputFields(OutputFieldsDeclarer arg0) {

	}

}
