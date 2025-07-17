package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 虚拟类目同步菜品简化接口的门店信息
 *
 * @author auto create
 * @since 1.0, 2020-09-07 16:12:55
 */
public class KbdishVirtualShopSimplifyInfo extends AlipayObject {

	private static final long serialVersionUID = 3465666861317172889L;

	/**
	 * 门店下虚拟类目信息
	 */
	@ApiListField("catetory_list")
	@ApiField("kbdish_virtual_catetory_simplify_info")
	private List<KbdishVirtualCatetorySimplifyInfo> catetoryList;

	/**
	 * 外部门店id，和shop_id做为二选一必填
	 */
	@ApiField("out_shop_id")
	private String outShopId;

	/**
	 * 口碑门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	public List<KbdishVirtualCatetorySimplifyInfo> getCatetoryList() {
		return this.catetoryList;
	}
	public void setCatetoryList(List<KbdishVirtualCatetorySimplifyInfo> catetoryList) {
		this.catetoryList = catetoryList;
	}

	public String getOutShopId() {
		return this.outShopId;
	}
	public void setOutShopId(String outShopId) {
		this.outShopId = outShopId;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
