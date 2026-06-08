package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 凭证核销历史查询接口
 *
 * @author auto create
 * @since 1.0, 2026-04-11 01:22:45
 */
public class AlipayMerchantVerifyHistoryQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1524341898494483648L;

	/**
	 * 业务发生时间结束，格式：yyyyMMdd
	 */
	@ApiField("gmt_create_end")
	private String gmtCreateEnd;

	/**
	 * 业务发生时间起始，格式：yyyyMMdd
	 */
	@ApiField("gmt_create_start")
	private String gmtCreateStart;

	/**
	 * 页码
	 */
	@ApiField("page_num")
	private String pageNum;

	/**
	 * 每页条数
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * null
	 */
	@ApiListField("shop_id_list")
	@ApiField("string")
	private List<String> shopIdList;

	public String getGmtCreateEnd() {
		return this.gmtCreateEnd;
	}
	public void setGmtCreateEnd(String gmtCreateEnd) {
		this.gmtCreateEnd = gmtCreateEnd;
	}

	public String getGmtCreateStart() {
		return this.gmtCreateStart;
	}
	public void setGmtCreateStart(String gmtCreateStart) {
		this.gmtCreateStart = gmtCreateStart;
	}

	public String getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(String pageNum) {
		this.pageNum = pageNum;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public List<String> getShopIdList() {
		return this.shopIdList;
	}
	public void setShopIdList(List<String> shopIdList) {
		this.shopIdList = shopIdList;
	}

}
