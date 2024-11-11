def buidApp() {
  echo 'building the applictaion'
}
def testApp() {
  echo 'testing 
}
def deployApp() {
  echo 'deploying the applictaion'
  echo "deploying version ${params.VERSION}"
}
return this
