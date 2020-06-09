#工厂模式  
通过工厂类`LanguageFactory`创建类实例。向`LanguageFactory.getLanguage(String languageType)`传入需要创建的类实例的参数去创建对应的类实例。向接口的使用者屏蔽了创建具体实现类的实例的细节。