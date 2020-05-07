package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AccessProduceQrcode;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.sales.kbasset.stuff.produceqrcode.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiSalesKbassetStuffProduceqrcodeBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6774251971236866227L;

	/** 
	 * 当前是否还有生产指令可以拉取；注意如果该值为false，也只有提示当前没有更多生产指令了，不代表后面没有生产指令，商户自己需要制定策略定时去拉取
	 */
	@ApiField("has_next_page")
	private Boolean hasNextPage;

	/** 
	 * 口碑码列表
	 */
	@ApiListField("list")
	@ApiField("access_produce_qrcode")
	private List<AccessProduceQrcode> list;

	public void setHasNextPage(Boolean hasNextPage) {
		this.hasNextPage = hasNextPage;
	}
	public Boolean getHasNextPage( ) {
		return this.hasNextPage;
	}

	public void setList(List<AccessProduceQrcode> list) {
		this.list = list;
	}
	public List<AccessProduceQrcode> getList( ) {
		return this.list;
	}

}
