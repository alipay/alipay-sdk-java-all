package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小程序智能营销商品信息回填接口
 *
 * @author auto create
 * @since 1.0, 2023-10-23 17:57:56
 */
public class TechriskInnovateMpcpromoItemSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8544745916353336878L;

	/**
	 * 被授权小程序appid
	 */
	@ApiField("auth_app_id")
	private String authAppId;

	/**
	 * 商品信息列表
	 */
	@ApiListField("item_list")
	@ApiField("mpc_item_v_o")
	private List<MpcItemVO> itemList;

	public String getAuthAppId() {
		return this.authAppId;
	}
	public void setAuthAppId(String authAppId) {
		this.authAppId = authAppId;
	}

	public List<MpcItemVO> getItemList() {
		return this.itemList;
	}
	public void setItemList(List<MpcItemVO> itemList) {
		this.itemList = itemList;
	}

}
