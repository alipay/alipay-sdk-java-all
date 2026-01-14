package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 手艺人查询
 *
 * @author auto create
 * @since 1.0, 2025-12-03 10:27:42
 */
public class AlipayCommerceMerchantcardBookingtechnicianQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2865931576969792485L;

	/**
	 * 页码
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 分页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 门店id【必填】
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 手艺人状态（枚举）
active       可预约状态
inactive     不可预约，后续可恢复成active
	 */
	@ApiField("status")
	private String status;

	/**
	 * null
	 */
	@ApiListField("technician_ids")
	@ApiField("string")
	private List<String> technicianIds;

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
