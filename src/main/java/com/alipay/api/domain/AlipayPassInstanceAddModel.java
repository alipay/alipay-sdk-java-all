package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝pass新建卡券实例接口
 *
 * @author auto create
 * @since 1.0, 2022-11-18 16:11:49
 */
public class AlipayPassInstanceAddModel extends AlipayObject {

	private static final long serialVersionUID = 6827851361549393926L;

	/**
	 * 支付宝用户识别信息，详见 <a href="https://opendocs.alipay.com/open/199/popvoucher#%E7%AC%AC%E4%BA%94%E6%AD%A5%EF%BC%9A%E8%B0%83%E7%94%A8%E6%8E%A5%E5%8F%A3%E5%8F%91%E5%88%B8">调用接口发券</a>。
	 */
	@ApiField("recognition_info")
	private String recognitionInfo;

	/**
	 * Alipass添加对象识别类型，枚举如下：
1：订单信息；
2：基于用户信息识别。
说明：支付宝卡包场景暂仅支持 2。
	 */
	@ApiField("recognition_type")
	private String recognitionType;

	/**
	 *  支付宝pass模版ID。通过<a href="https://opendocs.alipay.com/apis/api_24/alipay.pass.template.add">alipay.pass.template.add</a>(卡券模板创建接口)创建模板后返回的tpl_id。
	 */
	@ApiField("tpl_id")
	private String tplId;

	/**
	 * 模版动态参数信息，对应模板中$变量名$的动态参数。对应<a href="https://opendocs.alipay.com/apis/api_24/alipay.pass.template.add">alipay.pass.template.add</a>(卡券模板创建接口)创建模板后返回tpl_params字段。
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
