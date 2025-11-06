package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑仓库信息查询
 *
 * @author auto create
 * @since 1.0, 2018-08-22 11:17:06
 */
public class KoubeiRetailWmsWarehouseQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5671914169468875677L;

	/**
	 * 城市编码，国标码，与归属人ID查询配合使用
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 操作上下文
	 */
	@ApiField("operate_context")
	private OperateContext operateContext;

	/**
	 * 仓库的归属人类型，SUPPLIER供货商的仓库/PARTNER商户的仓库
	 */
	@ApiField("own_type")
	private String ownType;

	/**
	 * 仓库的归属人ID、与仓库ID选择一个作为查询条件
	 */
	@ApiField("owner_id")
	private String ownerId;

	/**
	 * 页码，分页参数，与归属人ID查询配合使用
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 每页大小，分页参数，与归属人ID查询配合使用
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 仓库编码、与归属人ID选择一个作为查询条件
	 */
	@ApiField("warehouse_code")
	private String warehouseCode;

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public OperateContext getOperateContext() {
		return this.operateContext;
	}
	public void setOperateContext(OperateContext operateContext) {
		this.operateContext = operateContext;
	}

	public String getOwnType() {
		return this.ownType;
	}
	public void setOwnType(String ownType) {
		this.ownType = ownType;
	}

	public String getOwnerId() {
		return this.ownerId;
	}
	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
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

	public String getWarehouseCode() {
		return this.warehouseCode;
	}
	public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
	}

}
