package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * mfv提交
 *
 * @author auto create
 * @since 1.0, 2022-08-22 16:26:37
 */
public class AlipayUserCertifyMfvSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 3493175247672236649L;

	/**
	 * execute_type标识提交内容，如果是预执行则填写preExecute，如果是执行则填写doExecute
	 */
	@ApiField("execute_type")
	private String executeType;

	/**
	 * out_biz_type和out_biz_order_no在同租户下控制幂等，需要找接口提供方分配
	 */
	@ApiField("out_biz_order_no")
	private String outBizOrderNo;

	/**
	 * out_biz_type和out_biz_order_no在同租户下控制幂等，需要找接口提供方分配
	 */
	@ApiField("out_biz_type")
	private String outBizType;

	/**
	 * params是核验参数，提交的是json格式，具体的key，需要看接入的场景scene_id，和接口的提供方分配
	 */
	@ApiField("params")
	private String params;

	/**
	 * scene_id是场景id，由接口提供方进行分配
	 */
	@ApiField("scene_id")
	private String sceneId;

	public String getExecuteType() {
		return this.executeType;
	}
	public void setExecuteType(String executeType) {
		this.executeType = executeType;
	}

	public String getOutBizOrderNo() {
		return this.outBizOrderNo;
	}
	public void setOutBizOrderNo(String outBizOrderNo) {
		this.outBizOrderNo = outBizOrderNo;
	}

	public String getOutBizType() {
		return this.outBizType;
	}
	public void setOutBizType(String outBizType) {
		this.outBizType = outBizType;
	}

	public String getParams() {
		return this.params;
	}
	public void setParams(String params) {
		this.params = params;
	}

	public String getSceneId() {
		return this.sceneId;
	}
	public void setSceneId(String sceneId) {
		this.sceneId = sceneId;
	}

}
