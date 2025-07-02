package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 办事类详细信息列表
 *
 * @author auto create
 * @since 1.0, 2024-04-17 12:56:02
 */
public class MsgOrderGoodsInfoList extends AlipayObject {

	private static final long serialVersionUID = 7145843246786329455L;

	/**
	 * 事项描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 具体办事描述
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 事项编码
	 */
	@ApiField("goods_id")
	private String goodsId;

	/**
	 * 事项名称
	 */
	@ApiField("goods_name")
	private String goodsName;

	/**
	 * 图片地址需要以https开头的域名地址
	 */
	@ApiField("goods_pic")
	private String goodsPic;

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getGoodsId() {
		return this.goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public String getGoodsName() {
		return this.goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getGoodsPic() {
		return this.goodsPic;
	}
	public void setGoodsPic(String goodsPic) {
		this.goodsPic = goodsPic;
	}

}
