package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序云智能应用数据查询接口
 *
 * @author auto create
 * @since 1.0, 2023-09-21 18:39:41
 */
public class TechriskInnovateMpcpromoDataQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7798222452154967488L;

	/**
	 * 物品的唯一id
	 */
	@ApiField("goods_id")
	private String goodsId;

	/**
	 * 查询起始页数
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 查询条数 最高200条
	 */
	@ApiField("page_size")
	private Long pageSize;

	public String getGoodsId() {
		return this.goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
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

}
