package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑仓库的商品信息查询
 *
 * @author auto create
 * @since 1.0, 2018-08-22 11:16:32
 */
public class KoubeiRetailWmsGoodsQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3586719722475952843L;

	/**
	 * 根据状态查询货品
EFFECTIVE：生效
INVALID ：无效
	 */
	@ApiField("biz_status")
	private String bizStatus;

	/**
	 * 类目ID
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 货品编码
	 */
	@ApiField("goods_code")
	private String goodsCode;

	/**
	 * 根据货品前缀名称查询
	 */
	@ApiField("goods_name")
	private String goodsName;

	/**
	 * 操作上下文
	 */
	@ApiField("operate_context")
	private OperateContext operateContext;

	/**
	 * 页码，分页参数，当以 goods_code为查询条件时不用传，默认1
	 */
	@ApiField("page_no")
	private String pageNo;

	/**
	 * 页面大小，分页参数，当以goods_code为查询条件时不用传，默认20
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 生产厂商ID
	 */
	@ApiField("producer_id")
	private String producerId;

	/**
	 * 供应商ID
	 */
	@ApiField("supplier_id")
	private String supplierId;

	public String getBizStatus() {
		return this.bizStatus;
	}
	public void setBizStatus(String bizStatus) {
		this.bizStatus = bizStatus;
	}

	public String getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getGoodsCode() {
		return this.goodsCode;
	}
	public void setGoodsCode(String goodsCode) {
		this.goodsCode = goodsCode;
	}

	public String getGoodsName() {
		return this.goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public OperateContext getOperateContext() {
		return this.operateContext;
	}
	public void setOperateContext(OperateContext operateContext) {
		this.operateContext = operateContext;
	}

	public String getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getProducerId() {
		return this.producerId;
	}
	public void setProducerId(String producerId) {
		this.producerId = producerId;
	}

	public String getSupplierId() {
		return this.supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

}
