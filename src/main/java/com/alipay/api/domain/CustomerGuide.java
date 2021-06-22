package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 用户引导配置
 *
 * @author auto create
 * @since 1.0, 2021-06-02 10:10:02
 */
public class CustomerGuide extends AlipayObject {

	private static final long serialVersionUID = 8557595672834645146L;

	/**
	 * 卡包详情页可跳转的小程序appId。 限制： 该appId归属的pid必须和当前商户保持一致。 目前mini_app_id与store_ids必须二选一。
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 指定跳转到mini_app_id时的具体页面路径。 限制： 该小程序路径是相对路径。
	 */
	@ApiField("mini_app_path")
	private String miniAppPath;

	/**
	 * 券可使用的门店列表。
接口参数是列表类型。

限制：
store_ids中的门店id必须是支付宝门店id。

store_ids如果包含重复的门店id会自动进行去重操作。

传入的store_ids中包含的门店id数量 <= 3000。

修改门店列表，只允许增加不允许减少。
	 */
	@ApiListField("store_ids")
	@ApiField("string")
	private List<String> storeIds;

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getMiniAppPath() {
		return this.miniAppPath;
	}
	public void setMiniAppPath(String miniAppPath) {
		this.miniAppPath = miniAppPath;
	}

	public List<String> getStoreIds() {
		return this.storeIds;
	}
	public void setStoreIds(List<String> storeIds) {
		this.storeIds = storeIds;
	}

}
