package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 按场景维度查询语音播报执行数据
 *
 * @author auto create
 * @since 1.0, 2026-07-09 10:29:31
 */
public class AlipayCommerceLogisticsVoiceDataQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7575216234418167975L;

	/**
	 * 格式yyyyMMdd，支持最近30天
	 */
	@ApiField("biz_date")
	private String bizDate;

	/**
	 * 维度值
	 */
	@ApiField("dim_key")
	private String dimKey;

	/**
	 * 维度类型
	 */
	@ApiField("dim_type")
	private String dimType;

	/**
	 * 不传时默认20
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 深分页时上一面返回的cur_page_max_data_id的值.不传时从最小id开始查询
	 */
	@ApiField("pre_page_max_data_id")
	private String prePageMaxDataId;

	public String getBizDate() {
		return this.bizDate;
	}
	public void setBizDate(String bizDate) {
		this.bizDate = bizDate;
	}

	public String getDimKey() {
		return this.dimKey;
	}
	public void setDimKey(String dimKey) {
		this.dimKey = dimKey;
	}

	public String getDimType() {
		return this.dimType;
	}
	public void setDimType(String dimType) {
		this.dimType = dimType;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getPrePageMaxDataId() {
		return this.prePageMaxDataId;
	}
	public void setPrePageMaxDataId(String prePageMaxDataId) {
		this.prePageMaxDataId = prePageMaxDataId;
	}

}
