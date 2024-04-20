This version uses Style.DOCUMENT

It allows you to compare:
Document/literal/wrapped vs. Document/literal/unwrapped (bare)

If you look in the HelloWorld.java file, you will see a choice between:
@SOAPBinding(style = Style.DOCUMENT, parameterStyle=SOAPBinding.ParameterStyle.BARE)
and 
@SOAPBinding(style = Style.DOCUMENT)

If you only set Style.DOCUMENT and do not set ParameterStyle.BARE, then it will default to Document/literal/wrapped
If you set Style.DOCUMENT and also set ParameterStyle.Bare, then it will use Document/literal/unwrapped (bare)

This particular example isn't really complicated enough to show the difference, but it will allow you to start playing with it.
