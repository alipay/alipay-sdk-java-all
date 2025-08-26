package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 福利平台用户订单外部核销接口
 *
 * @author auto create
 * @since 1.0, 2016-11-02 19:53:47
 */
public class AlipayEcoWelfareCodeSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7221696869488451684L;

	/**
	 * 支付宝账户USERID，和福利账户ID而选一，可以通过支付宝钱包用户信息共享接口获取支付宝账户ID
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 条码码值
	 */
	@ApiField("code")
	private String code;

	/**
	 * 条码可使用超时时间
格式为yyyy-MM-dd HH:mm:ss 
备注：超时时间不允许比启动时间小
	 */
	@ApiField("code_expire_date")
	private String codeExpireDate;

	/**
	 * 条码数量
	 */
	@ApiField("code_num")
	private Long codeNum;

	/**
	 * 条码图片url
	 */
	@ApiField("code_pic_url")
	private String codePicUrl;

	/**
	 * 条码可使用开发时间
格式为yyyy-MM-dd HH:mm:ss。
	 */
	@ApiField("code_start_date")
	private String codeStartDate;

	/**
	 * 条码状态
CREATE	创建
NOT_USED	没有使用
USED	已经被使用
INVALID	码无效
EXPIRED	码过期
DISABLED	码冻结
NOT_EXIST	码不存在
	 */
	@ApiField("code_status")
	private String codeStatus;

	/**
	 * 条码状态变更时间
格式为yyyy-MM-dd HH:mm:ss。
	 */
	@ApiField("code_status_date")
	private String codeStatusDate;

	/**
	 * 条码业务类型
商品品类码：goods
用户商品条码：barcode
	 */
	@ApiField("code_type")
	private String codeType;

	/**
	 * 扩展属性
	 */
	@ApiField("extend_params")
	private String extendParams;

	/**
	 * ISV代码，唯一确定ISV身份由福利平台分配
	 */
	@ApiField("isv_code")
	private String isvCode;

	/**
	 * 核销门店详细信息
	 */
	@ApiField("store_info")
	private WelfareEcoStoreInfo storeInfo;

	/**
	 * 同步数据时间 格式为yyyy-MM-dd HH:mm:ss。
	 */
	@ApiField("sync_date")
	private String syncDate;

	/**
	 * 福利平台订单对应的用户ID，和支付宝用户ID而选一
	 */
	@ApiField("welfare_user_id")
	private String welfareUserId;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getCodeExpireDate() {
		return this.codeExpireDate;
	}
	public void setCodeExpireDate(String codeExpireDate) {
		this.codeExpireDate = codeExpireDate;
	}

	public Long getCodeNum() {
		return this.codeNum;
	}
	public void setCodeNum(Long codeNum) {
		this.codeNum = codeNum;
	}

	public String getCodePicUrl() {
		return this.codePicUrl;
	}
	public void setCodePicUrl(String codePicUrl) {
		this.codePicUrl = codePicUrl;
	}

	public String getCodeStartDate() {
		return this.codeStartDate;
	}
	public void setCodeStartDate(String codeStartDate) {
		this.codeStartDate = codeStartDate;
	}

	public String getCodeStatus() {
		return this.codeStatus;
	}
	public void setCodeStatus(String codeStatus) {
		this.codeStatus = codeStatus;
	}

	public String getCodeStatusDate() {
		return this.codeStatusDate;
	}
	public void setCodeStatusDate(String codeStatusDate) {
		this.codeStatusDate = codeStatusDate;
	}

	public String getCodeType() {
		return this.codeType;
	}
	public void setCodeType(String codeType) {
		this.codeType = codeType;
	}

	public String getExtendParams() {
		return this.extendParams;
	}
	public void setExtendParams(String extendParams) {
		this.extendParams = extendParams;
	}

	public String getIsvCode() {
		return this.isvCode;
	}
	public void setIsvCode(String isvCode) {
		this.isvCode = isvCode;
	}

	public WelfareEcoStoreInfo getStoreInfo() {
		return this.storeInfo;
	}
	public void setStoreInfo(WelfareEcoStoreInfo storeInfo) {
		this.storeInfo = storeInfo;
	}

	public String getSyncDate() {
		return this.syncDate;
	}
	public void setSyncDate(String syncDate) {
		this.syncDate = syncDate;
	}

	public String getWelfareUserId() {
		return this.welfareUserId;
	}
	public void setWelfareUserId(String welfareUserId) {
		this.welfareUserId = welfareUserId;
	}

}
