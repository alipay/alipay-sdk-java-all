package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 转化分层基础信息
 *
 * @author auto create
 * @since 1.0, 2025-05-12 14:24:18
 */
public class ConvertedEventGrpDetail extends AlipayObject {

	private static final long serialVersionUID = 4727245781865947128L;

	/**
	 * 转化基础信息列表
	 */
	@ApiListField("converted_event_detail_list")
	@ApiField("converted_event_detail")
	private List<ConvertedEventDetail> convertedEventDetailList;

	/**
	 * 转化分层
	 */
	@ApiField("converted_event_grp")
	private String convertedEventGrp;

	/**
	 * 转化分层名称
	 */
	@ApiField("converted_event_grp_name")
	private String convertedEventGrpName;

	public List<ConvertedEventDetail> getConvertedEventDetailList() {
		return this.convertedEventDetailList;
	}
	public void setConvertedEventDetailList(List<ConvertedEventDetail> convertedEventDetailList) {
		this.convertedEventDetailList = convertedEventDetailList;
	}

	public String getConvertedEventGrp() {
		return this.convertedEventGrp;
	}
	public void setConvertedEventGrp(String convertedEventGrp) {
		this.convertedEventGrp = convertedEventGrp;
	}

	public String getConvertedEventGrpName() {
		return this.convertedEventGrpName;
	}
	public void setConvertedEventGrpName(String convertedEventGrpName) {
		this.convertedEventGrpName = convertedEventGrpName;
	}

}
