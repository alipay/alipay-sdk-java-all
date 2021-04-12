package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 天弘建信养老飞月宝实时申购信息接口
 *
 * @author auto create
 * @since 1.0, 2017-07-27 16:58:09
 */
public class AlipayFinanceZcbEndowmentorderDetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8737752827927374914L;

	/**
	 * 查询条件里时间区间的结束时间，格式为：YYYYMMDDHHMISS，采用左开右闭的方式
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * product_id：产品id，可以咨询蚂蚁这边的同学给出需要查询的产品id，查询订单只能按照产品纬度来查
	 */
	@ApiField("product_id")
	private String productId;

	/**
	 * 查询条件里时间区间的开始时间，格式：YYYYMMDDHHMISS，查询订单的开始时间，采用左开右闭的方式
	 */
	@ApiField("start_time")
	private String startTime;

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getProductId() {
		return this.productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

}
