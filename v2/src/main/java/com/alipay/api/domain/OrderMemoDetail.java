package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单备注信息
 *
 * @author auto create
 * @since 1.0, 2025-06-09 14:17:40
 */
public class OrderMemoDetail extends AlipayObject {

	private static final long serialVersionUID = 4453432976138633359L;

	/**
	 * 备注信息
	 */
	@ApiField("axf_order_memo_info")
	private AxfOrderMemoInfo axfOrderMemoInfo;

	/**
	 * 备注操作时间。格式yyyy-MM-dd HH:mm
	 */
	@ApiField("operate_time")
	private String operateTime;

	/**
	 * 操作类型。表示此次操作类型。新增备注，修改备注或删除备注
	 */
	@ApiField("operate_type")
	private String operateType;

	/**
	 * 操作人
	 */
	@ApiField("operator")
	private String operator;

	public AxfOrderMemoInfo getAxfOrderMemoInfo() {
		return this.axfOrderMemoInfo;
	}
	public void setAxfOrderMemoInfo(AxfOrderMemoInfo axfOrderMemoInfo) {
		this.axfOrderMemoInfo = axfOrderMemoInfo;
	}

	public String getOperateTime() {
		return this.operateTime;
	}
	public void setOperateTime(String operateTime) {
		this.operateTime = operateTime;
	}

	public String getOperateType() {
		return this.operateType;
	}
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

}
