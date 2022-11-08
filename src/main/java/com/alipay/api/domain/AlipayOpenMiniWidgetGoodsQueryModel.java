package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小部件商品查询
 *
 * @author auto create
 * @since 1.0, 2022-10-24 14:41:49
 */
public class AlipayOpenMiniWidgetGoodsQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8295473119345257874L;

	/**
	 * 根据商品的唯一标识查询
	 */
	@ApiField("goods_id")
	private String goodsId;

	/**
	 * 根据承接品的商家小程序ID查询
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 查询第几页，最小值为1
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 查询页面数量，最大值为50
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 根据承接该品的小程序背后的商家查询
	 */
	@ApiField("pid")
	private String pid;

	public String getGoodsId() {
		return this.goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
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

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

}
