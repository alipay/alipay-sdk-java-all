package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 手艺人分页查询
 *
 * @author auto create
 * @since 1.0, 2026-03-12 13:42:44
 */
public class AlipayCommerceLifeserviceTechnicianQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1862389278683116263L;

	/**
	 * null
	 */
	@ApiListField("out_technician_ids")
	@ApiField("string")
	private List<String> outTechnicianIds;

	/**
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 分页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 蚂蚁门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 手艺人状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * null
	 */
	@ApiListField("technician_ids")
	@ApiField("string")
	private List<String> technicianIds;

	public List<String> getOutTechnicianIds() {
		return this.outTechnicianIds;
	}
	public void setOutTechnicianIds(List<String> outTechnicianIds) {
		this.outTechnicianIds = outTechnicianIds;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public List<String> getTechnicianIds() {
		return this.technicianIds;
	}
	public void setTechnicianIds(List<String> technicianIds) {
		this.technicianIds = technicianIds;
	}

}
