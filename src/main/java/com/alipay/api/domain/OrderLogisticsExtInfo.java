package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 到位服务物流信息的扩展字段，包含服务的开始时间和结束时间信息
 *
 * @author auto create
 * @since 1.0, 2017-03-14 16:07:20
 */
public class OrderLogisticsExtInfo extends AlipayObject {

	private static final long serialVersionUID = 4691914445615113946L;

	/**
	 * 行业特殊物流信息字段，比如速运行业，起始地经纬度与目的地经纬度
	 */
	@ApiField("biz_info")
	private String bizInfo;

	/**
	 * 服务结束时间，格式为yyyy-MM-dd HH:mm（到分）
	 */
	@ApiField("gmt_end")
	private String gmtEnd;

	/**
	 * 服务开始时间，格式为yyyy-MM-dd HH:mm（到分）
	 */
	@ApiField("gmt_start")
	private String gmtStart;

	public String getBizInfo() {
		return this.bizInfo;
	}
	public void setBizInfo(String bizInfo) {
		this.bizInfo = bizInfo;
	}

	public String getGmtEnd() {
		return this.gmtEnd;
	}
	public void setGmtEnd(String gmtEnd) {
		this.gmtEnd = gmtEnd;
	}

	public String getGmtStart() {
		return this.gmtStart;
	}
	public void setGmtStart(String gmtStart) {
		this.gmtStart = gmtStart;
	}

}
