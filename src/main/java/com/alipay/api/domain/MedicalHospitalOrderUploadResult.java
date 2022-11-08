package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 医疗机构医院订单上传接口结果
 *
 * @author auto create
 * @since 1.0, 2022-03-23 15:31:16
 */
public class MedicalHospitalOrderUploadResult extends AlipayObject {

	private static final long serialVersionUID = 6626954316326611237L;

	/**
	 * 支付宝行业侧订单号列表
	 */
	@ApiListField("order_id_list")
	@ApiField("string")
	private List<String> orderIdList;

	/**
	 * 商户订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 链路追踪id
	 */
	@ApiField("trace_id")
	private String traceId;

	public List<String> getOrderIdList() {
		return this.orderIdList;
	}
	public void setOrderIdList(List<String> orderIdList) {
		this.orderIdList = orderIdList;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getTraceId() {
		return this.traceId;
	}
	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

}
