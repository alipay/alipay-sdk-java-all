package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 转化事件列表查询
 *
 * @author auto create
 * @since 1.0, 2021-06-09 17:12:24
 */
public class AlipayDataDataserviceAdConversionBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 4853355834618469244L;

	/**
	 * 灯火平台提供给外部系统的访问token
	 */
	@ApiField("biz_token")
	private String bizToken;

	/**
	 * 转化事件ID列表
	 */
	@ApiListField("conversion_id_list")
	@ApiField("string")
	private List<String> conversionIdList;

	/**
	 * 转化事件类型：
COLLECT_NORMAL - 免费留资
COLLECT_TRADE - 付费留资
CPA_TMALL_MEMBER_JOIN - 入会
等等
	 */
	@ApiField("conversion_type")
	private String conversionType;

	/**
	 * 分页参数之页数，从1开始
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 分页参数之每页大小，最大为1000
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 商家在灯火侧的id
	 */
	@ApiField("principal_id")
	private Long principalId;

	public String getBizToken() {
		return this.bizToken;
	}
	public void setBizToken(String bizToken) {
		this.bizToken = bizToken;
	}

	public List<String> getConversionIdList() {
		return this.conversionIdList;
	}
	public void setConversionIdList(List<String> conversionIdList) {
		this.conversionIdList = conversionIdList;
	}

	public String getConversionType() {
		return this.conversionType;
	}
	public void setConversionType(String conversionType) {
		this.conversionType = conversionType;
	}

	public Long getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getPrincipalId() {
		return this.principalId;
	}
	public void setPrincipalId(Long principalId) {
		this.principalId = principalId;
	}

}
