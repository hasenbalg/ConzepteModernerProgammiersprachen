#import <Foundation/Foundation.h>

int main (int argc, const char * argv[])
{
    NSMutableArray *objs = [[NSMutableArray alloc] init];

    [objs addObject:[NSObject new]];
    NSString *s = [(NSString *) objs objectAtIndex:0];

    printf("%s\n", [s UTF8String]);

   return 0;
}
/*
sh-4.3$ gcc `gnustep-config --objc-flags` -L/usr/GNUstep/System/Library/Libraries -lgnustep-base -lobjc *.m -o main                                              
main.m: In function 'main':                                                                                                                                      
main.m:8:5: warning: 'NSString' may not respond to '-objectAtIndex:'                                                                                             
     NSString *s = [(NSString *) objs objectAtIndex:0];                                                                                                          
     ^                                                                                                                                                           
main.m:8:5: warning: (Messages without a matching method signature                                                                                               
main.m:8:5: warning: will be assumed to return 'id' and accept                                                                                                   
main.m:8:5: warning: '...' as arguments.)
*/
