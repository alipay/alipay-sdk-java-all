package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 源汇率受理通知接口
 *
 * @author auto create
 * @since 1.0, 2016-10-27 14:12:34
 */
public class AlipayAccountExratePricingNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 7875161149797923428L;

	/**
	 * 标识该汇率提供给哪个客户使用
	 */
	@ApiField("client_id")
	private String clientId;

	/**
	 * 源汇率机构
	 */
	@ApiField("inst")
	private String inst;

	/**
	 * 源汇率数据
	 */
	@ApiListField("pricing_list")
	@ApiField("pricing_v_o")
	private List<PricingVO> pricingList;

	/**
	 * 该汇率的使用场景
	 */
	@ApiField("segment_id")
	private String segmentId;

	/**
	 * 所在时区，所有的时间都是该时区的时间
支持 GMT+8 UTC+0 Europe/London 的格式
	 */
	@ApiField("time_zone")
	private String timeZone;

	public String getClientId() {
		return this.clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getInst() {
		return this.inst;
	}
	public void setInst(String inst) {
		this.inst = inst;
	}

	public List<PricingVO> getPricingList() {
		return this.pricingList;
	}
	public void setPricingList(List<PricingVO> pricingList) {
		this.pricingList = pricingList;
	}

	public String getSegmentId() {
		return this.segmentId;
	}
	public void setSegmentId(String segmentId) {
		this.segmentId = segmentId;
	}

	public String getTimeZone() {
		return this.timeZone;
	}
	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

}
