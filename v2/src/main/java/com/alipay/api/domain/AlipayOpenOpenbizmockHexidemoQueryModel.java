package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * HeXi接口接入测试
 *
 * @author auto create
 * @since 1.0, 2023-06-08 21:04:50
 */
public class AlipayOpenOpenbizmockHexidemoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4418837796356833932L;

	/**
	 * 复杂接口的类型
	 */
	@ApiField("child_nodes")
	private JsonParamDemo childNodes;

	/**
	 * 文件内容
	 */
	@ApiField("file_param")
	private String fileParam;

	/**
	 * 123
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * openid
	 */
	@ApiField("other_open_id")
	private String otherOpenId;

	/**
	 * uid
	 */
	@ApiField("other_user_id")
	private String otherUserId;

	/**
	 * 外部业务号
	 */
	@ApiListField("out_biz_no")
	@ApiField("string")
	private List<String> outBizNo;

	/**
	 * 布尔值示例
	 */
	@ApiField("pattern_param")
	private String patternParam;

	/**
	 * 请输入数字
	 */
	@ApiField("req_num")
	private Long reqNum;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public JsonParamDemo getChildNodes() {
		return this.childNodes;
	}
	public void setChildNodes(JsonParamDemo childNodes) {
		this.childNodes = childNodes;
	}

	public String getFileParam() {
		return this.fileParam;
	}
	public void setFileParam(String fileParam) {
		this.fileParam = fileParam;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOtherOpenId() {
		return this.otherOpenId;
	}
	public void setOtherOpenId(String otherOpenId) {
		this.otherOpenId = otherOpenId;
	}

	public String getOtherUserId() {
		return this.otherUserId;
	}
	public void setOtherUserId(String otherUserId) {
		this.otherUserId = otherUserId;
	}

	public List<String> getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(List<String> outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPatternParam() {
		return this.patternParam;
	}
	public void setPatternParam(String patternParam) {
		this.patternParam = patternParam;
	}

	public Long getReqNum() {
		return this.reqNum;
	}
	public void setReqNum(Long reqNum) {
		this.reqNum = reqNum;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
