/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2025-03-05
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.alipay.v3.model;

import java.util.Objects;
import java.util.Arrays;
import com.alipay.v3.model.EinvTrade;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.alipay.v3.JSON;

/**
 * InvoiceElementModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InvoiceElementModel {
  public static final String SERIALIZED_NAME_EXPENSE_STATUS = "expense_status";
  @SerializedName(SERIALIZED_NAME_EXPENSE_STATUS)
  private String expenseStatus;

  public static final String SERIALIZED_NAME_EXTEND_FIELDS = "extend_fields";
  @SerializedName(SERIALIZED_NAME_EXTEND_FIELDS)
  private String extendFields;

  public static final String SERIALIZED_NAME_FAKE_CODE = "fake_code";
  @SerializedName(SERIALIZED_NAME_FAKE_CODE)
  private String fakeCode;

  public static final String SERIALIZED_NAME_FILE_TYPE = "file_type";
  @SerializedName(SERIALIZED_NAME_FILE_TYPE)
  private String fileType;

  public static final String SERIALIZED_NAME_HAS_PDF_FILE = "has_pdf_file";
  @SerializedName(SERIALIZED_NAME_HAS_PDF_FILE)
  private Boolean hasPdfFile;

  public static final String SERIALIZED_NAME_HAS_RISK = "has_risk";
  @SerializedName(SERIALIZED_NAME_HAS_RISK)
  private Boolean hasRisk;

  public static final String SERIALIZED_NAME_INVOICE_AMOUNT = "invoice_amount";
  @SerializedName(SERIALIZED_NAME_INVOICE_AMOUNT)
  private String invoiceAmount;

  public static final String SERIALIZED_NAME_INVOICE_CODE = "invoice_code";
  @SerializedName(SERIALIZED_NAME_INVOICE_CODE)
  private String invoiceCode;

  public static final String SERIALIZED_NAME_INVOICE_DATE = "invoice_date";
  @SerializedName(SERIALIZED_NAME_INVOICE_DATE)
  private String invoiceDate;

  public static final String SERIALIZED_NAME_INVOICE_IMG_URL = "invoice_img_url";
  @SerializedName(SERIALIZED_NAME_INVOICE_IMG_URL)
  private String invoiceImgUrl;

  public static final String SERIALIZED_NAME_INVOICE_KIND = "invoice_kind";
  @SerializedName(SERIALIZED_NAME_INVOICE_KIND)
  private String invoiceKind;

  public static final String SERIALIZED_NAME_INVOICE_NO = "invoice_no";
  @SerializedName(SERIALIZED_NAME_INVOICE_NO)
  private String invoiceNo;

  public static final String SERIALIZED_NAME_INVOICE_STATUS = "invoice_status";
  @SerializedName(SERIALIZED_NAME_INVOICE_STATUS)
  private String invoiceStatus;

  public static final String SERIALIZED_NAME_ISV_CONTACT = "isv_contact";
  @SerializedName(SERIALIZED_NAME_ISV_CONTACT)
  private String isvContact;

  public static final String SERIALIZED_NAME_ISV_NAME = "isv_name";
  @SerializedName(SERIALIZED_NAME_ISV_NAME)
  private String isvName;

  public static final String SERIALIZED_NAME_LOGO_URL = "logo_url";
  @SerializedName(SERIALIZED_NAME_LOGO_URL)
  private String logoUrl;

  public static final String SERIALIZED_NAME_M_NAME = "m_name";
  @SerializedName(SERIALIZED_NAME_M_NAME)
  private String mName;

  public static final String SERIALIZED_NAME_OUT_TAX_AMOUNT = "out_tax_amount";
  @SerializedName(SERIALIZED_NAME_OUT_TAX_AMOUNT)
  private String outTaxAmount;

  public static final String SERIALIZED_NAME_PAYEE_NAME = "payee_name";
  @SerializedName(SERIALIZED_NAME_PAYEE_NAME)
  private String payeeName;

  public static final String SERIALIZED_NAME_PAYEE_TAX_NO = "payee_tax_no";
  @SerializedName(SERIALIZED_NAME_PAYEE_TAX_NO)
  private String payeeTaxNo;

  public static final String SERIALIZED_NAME_PAYER_NAME = "payer_name";
  @SerializedName(SERIALIZED_NAME_PAYER_NAME)
  private String payerName;

  public static final String SERIALIZED_NAME_PAYER_TAX_NO = "payer_tax_no";
  @SerializedName(SERIALIZED_NAME_PAYER_TAX_NO)
  private String payerTaxNo;

  public static final String SERIALIZED_NAME_PDF_URL = "pdf_url";
  @SerializedName(SERIALIZED_NAME_PDF_URL)
  private String pdfUrl;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;

  public static final String SERIALIZED_NAME_TRADE_LIST = "trade_list";
  @SerializedName(SERIALIZED_NAME_TRADE_LIST)
  private List<EinvTrade> tradeList = null;

  public static final String SERIALIZED_NAME_TRADE_MATCH_RESULT = "trade_match_result";
  @SerializedName(SERIALIZED_NAME_TRADE_MATCH_RESULT)
  private String tradeMatchResult;

  public InvoiceElementModel() { 
  }

  public InvoiceElementModel expenseStatus(String expenseStatus) {
    
    this.expenseStatus = expenseStatus;
    return this;
  }

   /**
   * 发票报销状态
   * @return expenseStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "发票报销状态")

  public String getExpenseStatus() {
    return expenseStatus;
  }


  public void setExpenseStatus(String expenseStatus) {
    this.expenseStatus = expenseStatus;
  }


  public InvoiceElementModel extendFields(String extendFields) {
    
    this.extendFields = extendFields;
    return this;
  }

   /**
   * 扩展字段
   * @return extendFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "扩展字段")

  public String getExtendFields() {
    return extendFields;
  }


  public void setExtendFields(String extendFields) {
    this.extendFields = extendFields;
  }


  public InvoiceElementModel fakeCode(String fakeCode) {
    
    this.fakeCode = fakeCode;
    return this;
  }

   /**
   * 防伪校验码
   * @return fakeCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "防伪校验码")

  public String getFakeCode() {
    return fakeCode;
  }


  public void setFakeCode(String fakeCode) {
    this.fakeCode = fakeCode;
  }


  public InvoiceElementModel fileType(String fileType) {
    
    this.fileType = fileType;
    return this;
  }

   /**
   * 发票原始文件文件类型
   * @return fileType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "发票原始文件文件类型")

  public String getFileType() {
    return fileType;
  }


  public void setFileType(String fileType) {
    this.fileType = fileType;
  }


  public InvoiceElementModel hasPdfFile(Boolean hasPdfFile) {
    
    this.hasPdfFile = hasPdfFile;
    return this;
  }

   /**
   * 发票是否有pdf文件
   * @return hasPdfFile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "发票是否有pdf文件")

  public Boolean getHasPdfFile() {
    return hasPdfFile;
  }


  public void setHasPdfFile(Boolean hasPdfFile) {
    this.hasPdfFile = hasPdfFile;
  }


  public InvoiceElementModel hasRisk(Boolean hasRisk) {
    
    this.hasRisk = hasRisk;
    return this;
  }

   /**
   * 该发票可能存在异常，请核实后使用  true:无异常  false:存在异常
   * @return hasRisk
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "该发票可能存在异常，请核实后使用  true:无异常  false:存在异常")

  public Boolean getHasRisk() {
    return hasRisk;
  }


  public void setHasRisk(Boolean hasRisk) {
    this.hasRisk = hasRisk;
  }


  public InvoiceElementModel invoiceAmount(String invoiceAmount) {
    
    this.invoiceAmount = invoiceAmount;
    return this;
  }

   /**
   * 发票金额，含税，单位元
   * @return invoiceAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "发票金额，含税，单位元")

  public String getInvoiceAmount() {
    return invoiceAmount;
  }


  public void setInvoiceAmount(String invoiceAmount) {
    this.invoiceAmount = invoiceAmount;
  }


  public InvoiceElementModel invoiceCode(String invoiceCode) {
    
    this.invoiceCode = invoiceCode;
    return this;
  }

   /**
   * 发票代码
   * @return invoiceCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "发票代码")

  public String getInvoiceCode() {
    return invoiceCode;
  }


  public void setInvoiceCode(String invoiceCode) {
    this.invoiceCode = invoiceCode;
  }


  public InvoiceElementModel invoiceDate(String invoiceDate) {
    
    this.invoiceDate = invoiceDate;
    return this;
  }

   /**
   * 开票日期
   * @return invoiceDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "开票日期")

  public String getInvoiceDate() {
    return invoiceDate;
  }


  public void setInvoiceDate(String invoiceDate) {
    this.invoiceDate = invoiceDate;
  }


  public InvoiceElementModel invoiceImgUrl(String invoiceImgUrl) {
    
    this.invoiceImgUrl = invoiceImgUrl;
    return this;
  }

   /**
   * 发票pdf文件转换后jpg预览地址
   * @return invoiceImgUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "发票pdf文件转换后jpg预览地址")

  public String getInvoiceImgUrl() {
    return invoiceImgUrl;
  }


  public void setInvoiceImgUrl(String invoiceImgUrl) {
    this.invoiceImgUrl = invoiceImgUrl;
  }


  public InvoiceElementModel invoiceKind(String invoiceKind) {
    
    this.invoiceKind = invoiceKind;
    return this;
  }

   /**
   * 发票类型
   * @return invoiceKind
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "发票类型")

  public String getInvoiceKind() {
    return invoiceKind;
  }


  public void setInvoiceKind(String invoiceKind) {
    this.invoiceKind = invoiceKind;
  }


  public InvoiceElementModel invoiceNo(String invoiceNo) {
    
    this.invoiceNo = invoiceNo;
    return this;
  }

   /**
   * 发票号码
   * @return invoiceNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "发票号码")

  public String getInvoiceNo() {
    return invoiceNo;
  }


  public void setInvoiceNo(String invoiceNo) {
    this.invoiceNo = invoiceNo;
  }


  public InvoiceElementModel invoiceStatus(String invoiceStatus) {
    
    this.invoiceStatus = invoiceStatus;
    return this;
  }

   /**
   * 发票状态　
   * @return invoiceStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "发票状态　")

  public String getInvoiceStatus() {
    return invoiceStatus;
  }


  public void setInvoiceStatus(String invoiceStatus) {
    this.invoiceStatus = invoiceStatus;
  }


  public InvoiceElementModel isvContact(String isvContact) {
    
    this.isvContact = isvContact;
    return this;
  }

   /**
   * 服务商联系方式
   * @return isvContact
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "服务商联系方式")

  public String getIsvContact() {
    return isvContact;
  }


  public void setIsvContact(String isvContact) {
    this.isvContact = isvContact;
  }


  public InvoiceElementModel isvName(String isvName) {
    
    this.isvName = isvName;
    return this;
  }

   /**
   * 服务商名称
   * @return isvName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "服务商名称")

  public String getIsvName() {
    return isvName;
  }


  public void setIsvName(String isvName) {
    this.isvName = isvName;
  }


  public InvoiceElementModel logoUrl(String logoUrl) {
    
    this.logoUrl = logoUrl;
    return this;
  }

   /**
   * logo地址
   * @return logoUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "logo地址")

  public String getLogoUrl() {
    return logoUrl;
  }


  public void setLogoUrl(String logoUrl) {
    this.logoUrl = logoUrl;
  }


  public InvoiceElementModel mName(String mName) {
    
    this.mName = mName;
    return this;
  }

   /**
   * 商户全称
   * @return mName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商户全称")

  public String getmName() {
    return mName;
  }


  public void setmName(String mName) {
    this.mName = mName;
  }


  public InvoiceElementModel outTaxAmount(String outTaxAmount) {
    
    this.outTaxAmount = outTaxAmount;
    return this;
  }

   /**
   * 发票金额，不含税，单位元
   * @return outTaxAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "发票金额，不含税，单位元")

  public String getOutTaxAmount() {
    return outTaxAmount;
  }


  public void setOutTaxAmount(String outTaxAmount) {
    this.outTaxAmount = outTaxAmount;
  }


  public InvoiceElementModel payeeName(String payeeName) {
    
    this.payeeName = payeeName;
    return this;
  }

   /**
   * 销方名称
   * @return payeeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "销方名称")

  public String getPayeeName() {
    return payeeName;
  }


  public void setPayeeName(String payeeName) {
    this.payeeName = payeeName;
  }


  public InvoiceElementModel payeeTaxNo(String payeeTaxNo) {
    
    this.payeeTaxNo = payeeTaxNo;
    return this;
  }

   /**
   * 销方税号
   * @return payeeTaxNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "销方税号")

  public String getPayeeTaxNo() {
    return payeeTaxNo;
  }


  public void setPayeeTaxNo(String payeeTaxNo) {
    this.payeeTaxNo = payeeTaxNo;
  }


  public InvoiceElementModel payerName(String payerName) {
    
    this.payerName = payerName;
    return this;
  }

   /**
   * 购方名称
   * @return payerName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "购方名称")

  public String getPayerName() {
    return payerName;
  }


  public void setPayerName(String payerName) {
    this.payerName = payerName;
  }


  public InvoiceElementModel payerTaxNo(String payerTaxNo) {
    
    this.payerTaxNo = payerTaxNo;
    return this;
  }

   /**
   * 购方税号
   * @return payerTaxNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "购方税号")

  public String getPayerTaxNo() {
    return payerTaxNo;
  }


  public void setPayerTaxNo(String payerTaxNo) {
    this.payerTaxNo = payerTaxNo;
  }


  public InvoiceElementModel pdfUrl(String pdfUrl) {
    
    this.pdfUrl = pdfUrl;
    return this;
  }

   /**
   * PDF的下载链接
   * @return pdfUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "PDF的下载链接")

  public String getPdfUrl() {
    return pdfUrl;
  }


  public void setPdfUrl(String pdfUrl) {
    this.pdfUrl = pdfUrl;
  }


  public InvoiceElementModel source(String source) {
    
    this.source = source;
    return this;
  }

   /**
   * 表示发票来源，由发票回传方带入。例如：bz_gd，bz_ele，bz_tmall等
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "表示发票来源，由发票回传方带入。例如：bz_gd，bz_ele，bz_tmall等")

  public String getSource() {
    return source;
  }


  public void setSource(String source) {
    this.source = source;
  }


  public InvoiceElementModel tradeList(List<EinvTrade> tradeList) {
    
    this.tradeList = tradeList;
    return this;
  }

  public InvoiceElementModel addTradeListItem(EinvTrade tradeListItem) {
    if (this.tradeList == null) {
      this.tradeList = new ArrayList<>();
    }
    this.tradeList.add(tradeListItem);
    return this;
  }

   /**
   * 该发票对应的交易
   * @return tradeList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "该发票对应的交易")

  public List<EinvTrade> getTradeList() {
    return tradeList;
  }


  public void setTradeList(List<EinvTrade> tradeList) {
    this.tradeList = tradeList;
  }


  public InvoiceElementModel tradeMatchResult(String tradeMatchResult) {
    
    this.tradeMatchResult = tradeMatchResult;
    return this;
  }

   /**
   * 交易匹配结果
   * @return tradeMatchResult
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "交易匹配结果")

  public String getTradeMatchResult() {
    return tradeMatchResult;
  }


  public void setTradeMatchResult(String tradeMatchResult) {
    this.tradeMatchResult = tradeMatchResult;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the InvoiceElementModel instance itself
   */
  public InvoiceElementModel putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoiceElementModel invoiceElementModel = (InvoiceElementModel) o;
    return Objects.equals(this.expenseStatus, invoiceElementModel.expenseStatus) &&
        Objects.equals(this.extendFields, invoiceElementModel.extendFields) &&
        Objects.equals(this.fakeCode, invoiceElementModel.fakeCode) &&
        Objects.equals(this.fileType, invoiceElementModel.fileType) &&
        Objects.equals(this.hasPdfFile, invoiceElementModel.hasPdfFile) &&
        Objects.equals(this.hasRisk, invoiceElementModel.hasRisk) &&
        Objects.equals(this.invoiceAmount, invoiceElementModel.invoiceAmount) &&
        Objects.equals(this.invoiceCode, invoiceElementModel.invoiceCode) &&
        Objects.equals(this.invoiceDate, invoiceElementModel.invoiceDate) &&
        Objects.equals(this.invoiceImgUrl, invoiceElementModel.invoiceImgUrl) &&
        Objects.equals(this.invoiceKind, invoiceElementModel.invoiceKind) &&
        Objects.equals(this.invoiceNo, invoiceElementModel.invoiceNo) &&
        Objects.equals(this.invoiceStatus, invoiceElementModel.invoiceStatus) &&
        Objects.equals(this.isvContact, invoiceElementModel.isvContact) &&
        Objects.equals(this.isvName, invoiceElementModel.isvName) &&
        Objects.equals(this.logoUrl, invoiceElementModel.logoUrl) &&
        Objects.equals(this.mName, invoiceElementModel.mName) &&
        Objects.equals(this.outTaxAmount, invoiceElementModel.outTaxAmount) &&
        Objects.equals(this.payeeName, invoiceElementModel.payeeName) &&
        Objects.equals(this.payeeTaxNo, invoiceElementModel.payeeTaxNo) &&
        Objects.equals(this.payerName, invoiceElementModel.payerName) &&
        Objects.equals(this.payerTaxNo, invoiceElementModel.payerTaxNo) &&
        Objects.equals(this.pdfUrl, invoiceElementModel.pdfUrl) &&
        Objects.equals(this.source, invoiceElementModel.source) &&
        Objects.equals(this.tradeList, invoiceElementModel.tradeList) &&
        Objects.equals(this.tradeMatchResult, invoiceElementModel.tradeMatchResult)&&
        Objects.equals(this.additionalProperties, invoiceElementModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expenseStatus, extendFields, fakeCode, fileType, hasPdfFile, hasRisk, invoiceAmount, invoiceCode, invoiceDate, invoiceImgUrl, invoiceKind, invoiceNo, invoiceStatus, isvContact, isvName, logoUrl, mName, outTaxAmount, payeeName, payeeTaxNo, payerName, payerTaxNo, pdfUrl, source, tradeList, tradeMatchResult, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceElementModel {\n");
    sb.append("    expenseStatus: ").append(toIndentedString(expenseStatus)).append("\n");
    sb.append("    extendFields: ").append(toIndentedString(extendFields)).append("\n");
    sb.append("    fakeCode: ").append(toIndentedString(fakeCode)).append("\n");
    sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
    sb.append("    hasPdfFile: ").append(toIndentedString(hasPdfFile)).append("\n");
    sb.append("    hasRisk: ").append(toIndentedString(hasRisk)).append("\n");
    sb.append("    invoiceAmount: ").append(toIndentedString(invoiceAmount)).append("\n");
    sb.append("    invoiceCode: ").append(toIndentedString(invoiceCode)).append("\n");
    sb.append("    invoiceDate: ").append(toIndentedString(invoiceDate)).append("\n");
    sb.append("    invoiceImgUrl: ").append(toIndentedString(invoiceImgUrl)).append("\n");
    sb.append("    invoiceKind: ").append(toIndentedString(invoiceKind)).append("\n");
    sb.append("    invoiceNo: ").append(toIndentedString(invoiceNo)).append("\n");
    sb.append("    invoiceStatus: ").append(toIndentedString(invoiceStatus)).append("\n");
    sb.append("    isvContact: ").append(toIndentedString(isvContact)).append("\n");
    sb.append("    isvName: ").append(toIndentedString(isvName)).append("\n");
    sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
    sb.append("    mName: ").append(toIndentedString(mName)).append("\n");
    sb.append("    outTaxAmount: ").append(toIndentedString(outTaxAmount)).append("\n");
    sb.append("    payeeName: ").append(toIndentedString(payeeName)).append("\n");
    sb.append("    payeeTaxNo: ").append(toIndentedString(payeeTaxNo)).append("\n");
    sb.append("    payerName: ").append(toIndentedString(payerName)).append("\n");
    sb.append("    payerTaxNo: ").append(toIndentedString(payerTaxNo)).append("\n");
    sb.append("    pdfUrl: ").append(toIndentedString(pdfUrl)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    tradeList: ").append(toIndentedString(tradeList)).append("\n");
    sb.append("    tradeMatchResult: ").append(toIndentedString(tradeMatchResult)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("expense_status");
    openapiFields.add("extend_fields");
    openapiFields.add("fake_code");
    openapiFields.add("file_type");
    openapiFields.add("has_pdf_file");
    openapiFields.add("has_risk");
    openapiFields.add("invoice_amount");
    openapiFields.add("invoice_code");
    openapiFields.add("invoice_date");
    openapiFields.add("invoice_img_url");
    openapiFields.add("invoice_kind");
    openapiFields.add("invoice_no");
    openapiFields.add("invoice_status");
    openapiFields.add("isv_contact");
    openapiFields.add("isv_name");
    openapiFields.add("logo_url");
    openapiFields.add("m_name");
    openapiFields.add("out_tax_amount");
    openapiFields.add("payee_name");
    openapiFields.add("payee_tax_no");
    openapiFields.add("payer_name");
    openapiFields.add("payer_tax_no");
    openapiFields.add("pdf_url");
    openapiFields.add("source");
    openapiFields.add("trade_list");
    openapiFields.add("trade_match_result");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InvoiceElementModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (InvoiceElementModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in InvoiceElementModel is not found in the empty JSON string", InvoiceElementModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("expense_status") != null && !jsonObj.get("expense_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expense_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expense_status").toString()));
      }
      if (jsonObj.get("extend_fields") != null && !jsonObj.get("extend_fields").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `extend_fields` to be a primitive type in the JSON string but got `%s`", jsonObj.get("extend_fields").toString()));
      }
      if (jsonObj.get("fake_code") != null && !jsonObj.get("fake_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fake_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fake_code").toString()));
      }
      if (jsonObj.get("file_type") != null && !jsonObj.get("file_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `file_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("file_type").toString()));
      }
      if (jsonObj.get("invoice_amount") != null && !jsonObj.get("invoice_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoice_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoice_amount").toString()));
      }
      if (jsonObj.get("invoice_code") != null && !jsonObj.get("invoice_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoice_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoice_code").toString()));
      }
      if (jsonObj.get("invoice_date") != null && !jsonObj.get("invoice_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoice_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoice_date").toString()));
      }
      if (jsonObj.get("invoice_img_url") != null && !jsonObj.get("invoice_img_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoice_img_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoice_img_url").toString()));
      }
      if (jsonObj.get("invoice_kind") != null && !jsonObj.get("invoice_kind").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoice_kind` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoice_kind").toString()));
      }
      if (jsonObj.get("invoice_no") != null && !jsonObj.get("invoice_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoice_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoice_no").toString()));
      }
      if (jsonObj.get("invoice_status") != null && !jsonObj.get("invoice_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoice_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoice_status").toString()));
      }
      if (jsonObj.get("isv_contact") != null && !jsonObj.get("isv_contact").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `isv_contact` to be a primitive type in the JSON string but got `%s`", jsonObj.get("isv_contact").toString()));
      }
      if (jsonObj.get("isv_name") != null && !jsonObj.get("isv_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `isv_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("isv_name").toString()));
      }
      if (jsonObj.get("logo_url") != null && !jsonObj.get("logo_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logo_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logo_url").toString()));
      }
      if (jsonObj.get("m_name") != null && !jsonObj.get("m_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `m_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("m_name").toString()));
      }
      if (jsonObj.get("out_tax_amount") != null && !jsonObj.get("out_tax_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_tax_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_tax_amount").toString()));
      }
      if (jsonObj.get("payee_name") != null && !jsonObj.get("payee_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payee_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payee_name").toString()));
      }
      if (jsonObj.get("payee_tax_no") != null && !jsonObj.get("payee_tax_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payee_tax_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payee_tax_no").toString()));
      }
      if (jsonObj.get("payer_name") != null && !jsonObj.get("payer_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payer_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payer_name").toString()));
      }
      if (jsonObj.get("payer_tax_no") != null && !jsonObj.get("payer_tax_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payer_tax_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payer_tax_no").toString()));
      }
      if (jsonObj.get("pdf_url") != null && !jsonObj.get("pdf_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pdf_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pdf_url").toString()));
      }
      if (jsonObj.get("source") != null && !jsonObj.get("source").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source").toString()));
      }
      JsonArray jsonArraytradeList = jsonObj.getAsJsonArray("trade_list");
      if (jsonArraytradeList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("trade_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `trade_list` to be an array in the JSON string but got `%s`", jsonObj.get("trade_list").toString()));
        }

        // validate the optional field `trade_list` (array)
        for (int i = 0; i < jsonArraytradeList.size(); i++) {
          EinvTrade.validateJsonObject(jsonArraytradeList.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("trade_match_result") != null && !jsonObj.get("trade_match_result").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trade_match_result` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trade_match_result").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InvoiceElementModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InvoiceElementModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InvoiceElementModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InvoiceElementModel.class));

       return (TypeAdapter<T>) new TypeAdapter<InvoiceElementModel>() {
           @Override
           public void write(JsonWriter out, InvoiceElementModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public InvoiceElementModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             InvoiceElementModel instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else { // non-primitive type
                   instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InvoiceElementModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InvoiceElementModel
  * @throws IOException if the JSON string is invalid with respect to InvoiceElementModel
  */
  public static InvoiceElementModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InvoiceElementModel.class);
  }

 /**
  * Convert an instance of InvoiceElementModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

