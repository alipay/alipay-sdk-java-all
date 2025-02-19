package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小部件商品上传
 *
 * @author auto create
 * @since 1.0, 2022-12-06 13:21:14
 */
public class AlipayOpenMiniWidgetGoodsUploadModel extends AlipayObject {

	private static final long serialVersionUID = 2645796818994387359L;

	/**
	 * 商品信息列表
	 */
	@ApiListField("goods_list")
	@ApiField("widget_goods_info")
	private List<WidgetGoodsInfo> goodsList;

	/**
	 * 用于承接品的商家小程序ID
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 品的售卖商家，即承接该品的小程序背后的商家。和mini_app_id要求对应
	 */
	@ApiField("pid")
	private String pid;

	public List<WidgetGoodsInfo> getGoodsList() {
		return this.goodsList;
	}
	public void setGoodsList(List<WidgetGoodsInfo> goodsList) {
		this.goodsList = goodsList;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

}
