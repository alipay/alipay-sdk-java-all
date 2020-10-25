package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝pass新建卡券实例接口
 *
 * @author auto create
 * @since 1.0, 2020-01-08 15:43:52
 */
public class AlipayPassInstanceAddModel extends AlipayObject {

	private static final long serialVersionUID = 4612768149457386959L;

	/**
	 * 支付宝用户识别信息：uid发券组件。对接文档：https://docs.open.alipay.com/199/sy3hs4
	 */
	@ApiField("recognition_info")
	private String recognitionInfo;

	/**
	 * Alipass添加对象识别类型：1–订单信息
	 */
	@ApiField("recognition_type")
	private String recognitionType;

	/**
	 * 支付宝pass模版ID，即调用模板创建接口时返回的tpl_id。
	 */
	@ApiField("tpl_id")
	private String tplId;

	/**
	 * 模版动态参数信息：对应模板中$变量名$的动态参数，见模板创建接口返回值中的tpl_params字段
	 */
	@ApiField("tpl_params")
	private String tplParams;

	public String getRecognitionInfo() {
		return this.recognitionInfo;
	}
	public void setRecognitionInfo(String recognitionInfo) {
		this.recognitionInfo = recognitionInfo;
	}

	public String getRecognitionType() {
		return this.recognitionType;
	}
	public void setRecognitionType(String recognitionType) {
		this.recognitionType = recognitionType;
	}

	public String getTplId() {
		return this.tplId;
	}
	public void setTplId(String tplId) {
		this.tplId = tplId;
	}

	public String getTplParams() {
		return this.tplParams;
	}
	public void setTplParams(String tplParams) {
		this.tplParams = tplParams;
	}

}
