package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询缴费业务输出的出账机构
 *
 * @author auto create
 * @since 1.0, 2017-09-19 12:38:02
 */
public class AlipayEbppJfexportChargeinstQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5834212983198334886L;

	/**
	 * 业务类型英文简称，固定传JF，表示缴费
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 拓展字段，json串(key-value对)
	 */
	@ApiField("extend_field")
	private String extendField;

	/**
	 * 第几页，从1开始，默认为1
	 */
	@ApiField("page")
	private Long page;

	/**
	 * 是否分页查询，非分页查询时最多返回500条数据。
	 */
	@ApiField("page_query")
	private Boolean pageQuery;

	/**
	 * 每页展示的行数，默认为10
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 子业务类型英文简称，ELECTRIC-电费，WATER-水费，GAS-燃气费
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getExtendField() {
		return this.extendField;
	}
	public void setExtendField(String extendField) {
		this.extendField = extendField;
	}

	public Long getPage() {
		return this.page;
	}
	public void setPage(Long page) {
		this.page = page;
	}

	public Boolean getPageQuery() {
		return this.pageQuery;
	}
	public void setPageQuery(Boolean pageQuery) {
		this.pageQuery = pageQuery;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getSubBizType() {
		return this.subBizType;
	}
	public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
	}

}
