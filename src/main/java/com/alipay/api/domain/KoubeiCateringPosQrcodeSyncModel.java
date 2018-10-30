package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 自建盒子二维码同步
 *
 * @author auto create
 * @since 1.0, 2018-10-26 01:19:25
 */
public class KoubeiCateringPosQrcodeSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2656783748152653788L;

	/**
	 * 需要同步的桌台与二维码信息
	 */
	@ApiListField("list")
	@ApiField("qrcode_entity")
	private List<QrcodeEntity> list;

	public List<QrcodeEntity> getList() {
		return this.list;
	}
	public void setList(List<QrcodeEntity> list) {
		this.list = list;
	}

}
