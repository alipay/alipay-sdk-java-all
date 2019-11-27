package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 在与海关系统的对接中，支付单推送失败或支付单在海关系统中丢失的情况时常发生。原因可能是海关系统的不稳定、商户信息填写错误、支付单或订单格式不符合海关新增的校验逻辑等等。商户从海关处得到“支付信息不存在”的反馈后，请求支付宝技术支持查询支付单推送状态、重推支付单、或者修改备案号、备案名称或者需要推送的海关并且重推。占用技术支持大量时间，也降低了商户处理的效率。需要提供一个查询推送状态的接口，使商户能
 *
 * @author auto create
 * @since 1.0, 2016-10-26 18:05:13
 */
public class AlipayOverseasAcquireCustomsQueryDepreModel extends AlipayObject {

	private static final long serialVersionUID = 8821588492412435585L;

	/**
	 * 需要查询的商户端报关请求号，支持批量查询，多个值用逗号分隔，单次最多10个
	 */
	@ApiListField("out_request_nos")
	@ApiField("string")
	private List<String> outRequestNos;

	public List<String> getOutRequestNos() {
		return this.outRequestNos;
	}
	public void setOutRequestNos(List<String> outRequestNos) {
		this.outRequestNos = outRequestNos;
	}

}
