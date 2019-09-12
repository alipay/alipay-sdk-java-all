package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 云客服热线数据查询，云客服会有很多外部客服，他们需要查询落地在站内的自己公司的服务数据。
 *
 * @author auto create
 * @since 1.0, 2016-10-26 18:05:20
 */
public class AlipayBossCsChannelQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3679818948484323325L;

	/**
	 * 平均通话时长的qualifier
	 */
	@ApiField("att")
	private String att;

	/**
	 * 总接通率的qualifier
	 */
	@ApiField("connectionrate")
	private String connectionrate;

	/**
	 * 在线小二人数的qualifier
	 */
	@ApiField("curragentsloggedin")
	private String curragentsloggedin;

	/**
	 * 通话中人数的qualifier
	 */
	@ApiField("curragenttalking")
	private String curragenttalking;

	/**
	 * 小休人数的qualifier
	 */
	@ApiField("currentnotreadyagents")
	private String currentnotreadyagents;

	/**
	 * 等待人数的qualifier
	 */
	@ApiField("currentreadyagents")
	private String currentreadyagents;

	/**
	 * 总排队数的Qualifier
	 */
	@ApiField("currnumberwaitingcalls")
	private String currnumberwaitingcalls;

	/**
	 * 查询hbase的rowkey
	 */
	@ApiField("endkey")
	private String endkey;

	/**
	 * 查询hbase的rowkey
	 */
	@ApiField("startkey")
	private String startkey;

	/**
	 * 总流入量的qualifier
	 */
	@ApiField("visitorinflow")
	private String visitorinflow;

	/**
	 * 总应答量的qualifier
	 */
	@ApiField("visitorresponse")
	private String visitorresponse;

	/**
	 * 应答量[转接] 的qualifier
	 */
	@ApiField("visitorresponsetransfer")
	private String visitorresponsetransfer;

	public String getAtt() {
		return this.att;
	}
	public void setAtt(String att) {
		this.att = att;
	}

	public String getConnectionrate() {
		return this.connectionrate;
	}
	public void setConnectionrate(String connectionrate) {
		this.connectionrate = connectionrate;
	}

	public String getCurragentsloggedin() {
		return this.curragentsloggedin;
	}
	public void setCurragentsloggedin(String curragentsloggedin) {
		this.curragentsloggedin = curragentsloggedin;
	}

	public String getCurragenttalking() {
		return this.curragenttalking;
	}
	public void setCurragenttalking(String curragenttalking) {
		this.curragenttalking = curragenttalking;
	}

	public String getCurrentnotreadyagents() {
		return this.currentnotreadyagents;
	}
	public void setCurrentnotreadyagents(String currentnotreadyagents) {
		this.currentnotreadyagents = currentnotreadyagents;
	}

	public String getCurrentreadyagents() {
		return this.currentreadyagents;
	}
	public void setCurrentreadyagents(String currentreadyagents) {
		this.currentreadyagents = currentreadyagents;
	}

	public String getCurrnumberwaitingcalls() {
		return this.currnumberwaitingcalls;
	}
	public void setCurrnumberwaitingcalls(String currnumberwaitingcalls) {
		this.currnumberwaitingcalls = currnumberwaitingcalls;
	}

	public String getEndkey() {
		return this.endkey;
	}
	public void setEndkey(String endkey) {
		this.endkey = endkey;
	}

	public String getStartkey() {
		return this.startkey;
	}
	public void setStartkey(String startkey) {
		this.startkey = startkey;
	}

	public String getVisitorinflow() {
		return this.visitorinflow;
	}
	public void setVisitorinflow(String visitorinflow) {
		this.visitorinflow = visitorinflow;
	}

	public String getVisitorresponse() {
		return this.visitorresponse;
	}
	public void setVisitorresponse(String visitorresponse) {
		this.visitorresponse = visitorresponse;
	}

	public String getVisitorresponsetransfer() {
		return this.visitorresponsetransfer;
	}
	public void setVisitorresponsetransfer(String visitorresponsetransfer) {
		this.visitorresponsetransfer = visitorresponsetransfer;
	}

}
