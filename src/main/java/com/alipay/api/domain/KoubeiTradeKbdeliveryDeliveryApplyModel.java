package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑物流单创建
 *
 * @author auto create
 * @since 1.0, 2020-11-24 15:52:09
 */
public class KoubeiTradeKbdeliveryDeliveryApplyModel extends AlipayObject {

	private static final long serialVersionUID = 7861857977968132231L;

	/**
	 * 附加数据，在查询API和物流变更通知回执中原样返回，该字段主要用于第三方系统携带订单的自定义数据
	 */
	@ApiField("attach")
	private String attach;

	/**
	 * 物流请求扩展信息，详细见模型字段说明；
在CUPBOARD：取餐柜模式 必填
在CUPBOARD（取餐柜模式 场景）；支持2种模式单元格分配规则（2选1）；
分配规则1：指定设备编号+指定单元格编号
分配规则2：指定申请单元格数量，自动分配
两者都传入，优先按分配规则1处理
	 */
	@ApiField("logistics_external_info")
	private LogisticsExternalInfo logisticsExternalInfo;

	/**
	 * 物流类型，仅可填入可支持的物流类型，可支持的类型如下：
CUPBOARD：取餐柜模式
COMMON：骑手配送模式
	 */
	@ApiField("logistics_type")
	private String logisticsType;

	/**
	 * 口碑交易订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 备注信息
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 请求id，唯一标识一次请求；
	 */
	@ApiField("request_id")
	private String requestId;

	public String getAttach() {
		return this.attach;
	}
	public void setAttach(String attach) {
		this.attach = attach;
	}

	public LogisticsExternalInfo getLogisticsExternalInfo() {
		return this.logisticsExternalInfo;
	}
	public void setLogisticsExternalInfo(LogisticsExternalInfo logisticsExternalInfo) {
		this.logisticsExternalInfo = logisticsExternalInfo;
	}

	public String getLogisticsType() {
		return this.logisticsType;
	}
	public void setLogisticsType(String logisticsType) {
		this.logisticsType = logisticsType;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
